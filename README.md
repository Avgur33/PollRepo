===============================

###  Stack
- Spring Boot 2.5, Spring MVC, Security, Lombok, H2, Swagger/OpenAPI 3.0

### Task:
Задача: спроектировать и разработать API для системы опросов пользователей.

Функционал для администратора системы:

- авторизация в системе (регистрация не нужна)
- добавление/изменение/удаление опросов. Атрибуты опроса: название, дата старта, дата окончания, описание. После создания поле "дата старта" у опроса менять нельзя
- добавление/изменение/удаление вопросов в опросе. Атрибуты вопросов: текст вопроса, тип вопроса (ответ текстом, ответ с выбором одного варианта, ответ с выбором нескольких вариантов)

Функционал для пользователей системы:

- получение списка активных опросов
- прохождение опроса: опросы можно проходить анонимно, в качестве идентификатора пользователя в API передаётся числовой ID, по которому сохраняются ответы пользователя на вопросы; один пользователь может участвовать в любом количестве опросов
- получение пройденных пользователем опросов с детализацией по ответам (что выбрано) по ID уникальному пользователя

Использовать следующие технологии: Spring Framework.

Результат выполнения задачи:
- исходный код приложения в github (только на github, публичный репозиторий)
- инструкция по разворачиванию приложения (в docker или локально)
- документация по API

### Description
- DB - H2 (in memory)


### For run
- java version: 16
- mvn version: apache maven 3.8.1

1) склонировать github (https://github.com/Avgur33/PollRepo.git)
2) выполнить команду в консоле: mvn clean install
3) выполнить команду в консоле: mvn spring-boot:run

default port - http://localhost:8080/

### For test
- DB - http://localhost:8080/h2-console
- Swagger - http://localhost:8080/swagger-ui
- Документация по API swagger.json
- Параметры для тестирования:
    - пользователь с ролью ADMIN :
        - логин: admin@gmail.com
        - пароль: admin
