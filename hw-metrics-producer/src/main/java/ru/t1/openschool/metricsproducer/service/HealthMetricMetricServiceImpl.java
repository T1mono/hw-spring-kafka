package metricsproducer.service;

import lombok.RequiredArgsConstructor;
import metricsproducer.dto.HealthMetricDto;
import metricsproducer.model.HealthMetricEntity;
import metricsproducer.repository.HealthMetricRepository;
import org.springframework.stereotype.Service;

/**
 * Класс для работы со справочником my_db.health-metric.
 */
@Service
@RequiredArgsConstructor
public class HealthMetricMetricServiceImpl implements HealthMetricService {

    private final HealthMetricRepository healthMetricRepository;

    @Override
    public HealthMetricEntity createHealthMetric(HealthMetricDto healthMetricDto) {

        HealthMetricEntity healthMetricEntity = new HealthMetricEntity();
        healthMetricEntity.setMetric(healthMetricDto.getMetric());

      return  healthMetricRepository.save(healthMetricEntity);
    }
}
