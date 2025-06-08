# Shopko Backend – Spring Boot REST API

Ovo je backend servis za aplikaciju **Shopko**, razvijen u Spring Bootu s ciljem pružanja REST API-ja za upravljanje podacima o artiklima i trgovinama.

## Ključne funkcionalnosti

- REST API za dohvat artikala iz više trgovina
- Paginacija rezultata (`page`, `size`)
- Dohvat trgovina i njihovih geolokacijskih podataka (Google Maps API)
- Automatsko spremanje koordinata u MongoDB bazu
- Struktura pogodna za nadogradnju s filtriranjem, autentikacijom i drugim naprednim funkcijama

## Tehnologije i alati

- **Jezik:** Kotlin
- **Framework:** Spring Boot
- **Baza podataka:** MongoDB
- **HTTP klijent:** Spring WebClient (Google Maps API)
- **Build alat:** Gradle
- **Logiranje:** SLF4J + Logback

## API endpointi

| Metoda | Ruta                        | Opis                                  |
|--------|-----------------------------|---------------------------------------|
| GET    | `/articles?page=0&size=10`  | Dohvat artikala s paginacijom         |
| GET    | `/stores?page=0&size=10`    | Dohvat trgovina s koordinatama        |

## Konfiguracija

U `application.properties`) datoteci:

```yaml
spring.application.name=${APP_NAME}
spring.data.mongodb.database=${DB_NAME}
spring.data.mongodb.uri=${MONGO_URI}
google.api.key=${API_KEY}

Primjeri API poziva
bash
Copy
Edit
curl "https://shopkobe.onrender.com/articles?page=0&size=5"
curl "https://shopkobe.onrender.com/stores?page=1&size=10"
```
👤 Autor
Simon Vincek – simon.vincek@gmail.com
