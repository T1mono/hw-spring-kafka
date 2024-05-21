package metricsproducer.repository;

import metricsproducer.model.HealthMetricEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Репозиторий для получения записей из my_db.health_metric.
 */
public interface HealthMetricRepository extends CrudRepository<HealthMetricEntity, Long> {
}
