package ru.t1.opencschool.hwmetricsconsumer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.t1.opencschool.hwmetricsconsumer.model.HealthMetricEntity;
import ru.t1.opencschool.hwmetricsconsumer.service.HealthMetricService;

import java.util.Optional;

/**
 * Контроллер для работы со справочником метрики health.
 */
@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
@Slf4j
public class HealthController {

    private final HealthMetricService healthMetricService;

    @GetMapping("/health-metric/{id}")
    public ResponseEntity<Optional<HealthMetricEntity>> getById(@PathVariable Long id) {
        Optional<HealthMetricEntity> result = healthMetricService.getById(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/health-metric")
    public Iterable<HealthMetricEntity> getAllHealthMetrics() {
        return healthMetricService.getAllHealthMetrics();
    }
}
