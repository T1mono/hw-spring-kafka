package metricsproducer.service;

import metricsproducer.dto.HealthMetricDto;
import metricsproducer.model.HealthMetricEntity;
import org.springframework.transaction.annotation.Transactional;

public interface HealthMetricService {

    @Transactional
    HealthMetricEntity createHealthMetric(HealthMetricDto healthMetricDto);
}
