# SavePenny-server

## Opis
SavePenny-server to backendowa część aplikacji "Save a Penny", która pozwala na zapisywanie bieżących wydatków oraz wpływów na konto. Aplikacja umożliwia zarządzanie wydatkami i wpływami, wyświetlanie różnych list podsumowujących wydatki i dochody. Jest to komponent serwerowy, który łączy się z bazą danych PostgreSQL, aby zapisywać i odczytywać dane oraz dostarczać API dla aplikacji frontendowej.

## Technologie
Projekt został zbudowany z wykorzystaniem:
- Java 17
- Spring Boot
- Maven
- Docker

## Instalacja

### Pierwsze uruchomienie
Jeśli uruchamiasz projekt po raz pierwszy, musisz utworzyć bazę danych o nazwie `savepenny2`. Możesz to zrobić z poziomu terminala łącząc się z PostgreSQL lub poprzez narzędzia obsługi PostgreSQL jak np. PG Admin.

### Budowanie projektu
1. **Budowanie JAR dla projektu Java w Springu**
    Możesz zbudować projekt przy użyciu komendy:
    ```
    ./mvnw clean package -DskipTests
    ```
    lub za pomocą zadania Mavenowego w IDE, wpisując w sekcji "Run" komendę:
    ```
    clean package -DskipTests
    ```

2. **Uruchomienie Dockera**
    Po utworzeniu pliku JAR (w folderze `target`), możesz uruchomić projekt za pomocą Dockera. Projekt obejmuje konfiguracje wszystkich 3 kontenerów: frontendu, backendu i bazy danych.
    ```
    docker compose up --build
    ```
