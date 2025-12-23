# Quarkus PostgreSQL REST API

A simple RESTful API built with Quarkus framework that connects to a PostgreSQL database to manage customer data.

## Technologies Used

- **Quarkus** - A Kubernetes Native Java framework
- **PostgreSQL** - Open source relational database
- **Hibernate ORM** - Object-relational mapping
- **RESTEasy** - JAX-RS implementation for RESTful web services
- **OpenTelemetry** - For application observability
- **Docker** - For containerization

## Prerequisites

- JDK 21
- Maven 3.8+
- PostgreSQL database
- Docker (optional, for containerization)

## Configuration

The application is configured via environment variables or application.properties:

- `JDBC_URL` - Database URL (default: jdbc:postgresql://localhost:5432/test_db)
- `JDBC_USERNAME` - Database username (default: postgres)
- `JDBC_PASSWORD` - Database password (default: postgres)
- `OTEL_URL` - OpenTelemetry endpoint (default: http://192.168.8.140:4317)
- `LOG_LEVEL` - Logging level for com.edw package (default: DEBUG)

## Database Setup

Create the customer table in PostgreSQL:

```sql
create table public.t_customer
(
    customer_id   bigint default nextval('"t_customer _customer_id _seq"'::regclass) not null
        constraint t_customer_pk
            primary key,
    customer_name varchar(255) not null
);

alter table public.t_customer
    owner to postgres;

INSERT INTO public.t_customer (customer_id, customer_name) VALUES (1, 'Ryoko Hirosue');
INSERT INTO public.t_customer (customer_id, customer_name) VALUES (2, 'Kasumi Arimura');
INSERT INTO public.t_customer (customer_id, customer_name) VALUES (3, 'Hikari Mitsushima');
INSERT INTO public.t_customer (customer_id, customer_name) VALUES (4, 'Nanao Arai');
INSERT INTO public.t_customer (customer_id, customer_name) VALUES (5, 'Mikako Tabe');
```

## Building the Application

```bash
mvn clean package
```

For native build:

```bash
mvn clean package -Pnative
```

## Running the Application

```bash
java -jar target/quarkus-app/quarkus-run.jar
```

Or using Quarkus dev mode:

```bash
mvn quarkus:dev
```

## API Endpoints

- `GET /api/v1/customers/` - Retrieve all customers

## Docker

Build and run using the provided Dockerfile:

```bash
docker build -f Dockerfile.distroless -t quarkus-postgresql .
docker run -p 8080:8080 quarkus-postgresql
```

## Author

Muhammad Edwin (edwin@redhat.com)
