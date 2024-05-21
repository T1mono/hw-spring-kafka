package ru.t1.opencschool.hwmetricsconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.t1.opencschool.hwmetricsconsumer.model.HealthMetricEntity;

/**
 * Репозиторий для получения записей из my_db.health_metric.
 */
@Repository
public interface HealthMetricRepository extends JpaRepository<HealthMetricEntity, Long> {
}
