package ru.t1.opencschool.hwmetricsconsumer.dto;

import lombok.Data;

/**
 * Запись справочника my_db.health_metric из базы данных.
 */
@Data
public class HealthMetricDto {
    private String name;
}
