# RPS-Telegram

https://t.me/RePaSy_bot

Это приложение использует Spring Boot для создания системы рекомендации картин на основе жанров и предпочтений пользователей. Оно позволяет пользователям получать персонализированные рекомендации и осуществлять глобальный поиск по коллекции картин для корректировки рекомендаций.

## Функциональности

- **Рекомендации на основе жанров:** Пользователи могут получать рекомендации картин на основе предварительной калибровки по жанрам. Система анализирует предпочтения пользователя и рекомендует соответствующие картины.
- **Добавление в коллекцию:** Пользователи могут добавлять картины в свою коллекцию, что позволяет системе улучшать рекомендации на основе дальнейших предпочтений.

- **Глобальный поиск:** Доступен глобальный поиск по коллекции картин, который позволяет пользователям искать конкретные картины и корректировать рекомендации.

## Использование

1. **Калибровка по жанрам:**

   - Пользователи могут начать с калибровки по жанрам, указав свои предпочтения в определенных жанрах живописи.

2. **Добавление в коллекцию:**

   - После калибровки пользователи могут добавлять понравившиеся картины в свою коллекцию, улучшая тем самым рекомендации.

3. **Глобальный поиск:**
   - Поиск позволяет пользователям искать картины по различным критериям, что влияет на рекомендации в будущем.

## Технологии

Это приложение разработано на Spring Boot и использует базу данных Neo4j для хранения информации о коллекции картин и предпочтениях пользователей.

## Дополнительные настройки

- Для подключения к базе данных Neo4j или другим сервисам, необходимо внести соответствующие настройки в файл `application.properties` или `application.yml`.

## Вклад и разработка

Если вы хотите внести свой вклад или улучшить это приложение, не стесняйтесь создавать запросы на слияние (pull requests) или открывать новые задачи (issues).
