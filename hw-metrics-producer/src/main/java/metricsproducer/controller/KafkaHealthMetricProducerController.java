package metricsproducer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import metricsproducer.dto.HealthMetricDto;
import metricsproducer.service.HealthMetricService;
import metricsproducer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Контроллер для работы со справочником метрики health и отправки сообщений в
 * брокер Kafka.
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class KafkaHealthMetricProducerController {

    private final KafkaProducerService kafkaProducerService;
    private final RestTemplate restTemplate;
    private final HealthMetricService healthMetricService;


    @PostMapping("/send-metric")
    public String sendMetric() {
        String healthMetric = restTemplate.getForObject("http://localhost:8080/actuator/health", String.class);
        kafkaProducerService.sendMessage(healthMetric);

        HealthMetricDto metric = new HealthMetricDto();
        metric.setMetric(healthMetric);
        healthMetricService.createHealthMetric(metric);

        return "Health metric sent!";
    }
}
