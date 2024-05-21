package ru.t1.opencschool.hwmetricsconsumer.service;

import org.springframework.transaction.annotation.Transactional;
import ru.t1.opencschool.hwmetricsconsumer.model.HealthMetricEntity;

import java.util.Optional;

public interface HealthMetricService {
    Iterable<HealthMetricEntity> getAllHealthMetrics();

    @Transactional
    Optional<HealthMetricEntity> getById(Long id);
}
