package metricsproducer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Справочник метрики health.
 * Представление записи справочника my_db.health в базе данных.
 */
@Entity
@Table(name = "health_metric")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HealthMetricEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "metric")
    private String metric;
}
