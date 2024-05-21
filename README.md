# hw-spring-kafka

## Описание

Реализация системы мониторинга из двух микросервисов с использованием Spring Kafka

## Сборка backend части

```cmd
cd hw-metrics-consumer && mvn clean package
cd hw-metrics-producer && mvn clean package
```
Linux (bash):
```bash
(cd hw-metrics-consumer && mvn clean package)
(cd hw-metrics-producer && mvn clean package)
```

## Запуск

### Простой запуск:
```bash
java -jar target/hw-metrics-consumer-0.0.1-SNAPSHOT.jar
java -jar target/hw-metrics-producer-0.0.1-SNAPSHOT.jar
```

## Использование swagger, если добавлена зависимость в проект

URL с swagger документацией для hw-metrics-producer: http://localhost:8080/swagger-ui/index.html

URL с swagger документацией для hw-metrics-consumer: http://localhost:8000/swagger-ui/index.html

## Запуск контейнера Kafka и Zookeeper

```bash
cd hw-metrics-producer && docker-compose up
```

## Запуск браузера с отключённым CORS

chrome.exe --user-data-dir="C://chrome-dev-disabled-security" --disable-web-security --disable-site-isolation-trials

## Скрпит для создания таблицы метрики в БД

```
CREATE TABLE my_db.health_metric
(
    id     bigint NOT NULL AUTO_INCREMENT,
    metric varchar(100),
    PRIMARY KEY (id)
);
```