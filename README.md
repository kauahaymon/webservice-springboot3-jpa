# Web Service Application

[![NPM License](https://img.shields.io/npm/l/react)](https://github.com/kauahaymon/webservice-springboot3-jpa/blob/main/LICENSE)

Leitura em português: [README](https://github.com/kauahaymon/webservice-springboot3-jpa/blob/main/README_Portuguese.md)

## About the project

- This project is a fully functional e-commerce web application built using Spring Boot and JPA / Hibernate.
- It demonstrates the implementation of a complete **domain model**, **layered architecture**, **database configuration**, and **CRUD** operations, all while handling **exceptions effectively**.

## Domain Model

![Domain](https://github.com/kauahaymon/illustrative-images/blob/master/Class1.svg)

## Database Schema
![schema](https://github.com/kauahaymon/illustrative-images/blob/master/schema%20diagram.svg)

## Technologies Used

### Back end

- Java
- Spring Boot
- JPA / Hibernate
- Maven

### Production Deployment

- Back end: [Render](render.com)
- Banco de dados: PostgreSQL
- Testes: H2, Postman

## Skills Demonstrated

- Layered Architecture
- Docker

## Order Request Demonstration

Body of a client order request:

Link: <a href="https://webservice-springboot3-jpa.onrender.com/orders/1" target="_blank" rel="noopener noreferrer">Order 1</a>

```json
{
  "id": 1,
  "moment": "2024-06-24T14:08:03Z",
  "orderStatus": "PAID",
  "client": {
    "id": 1,
    "name": "Charles Darwin",
    "email": "charles@gmail.com",
    "phone": "98888-8888",
    "password": "123456"
  },
  "items": [
    {
      "quantity": 2,
      "price": 90.5,
      "subTotal": 181,
      "product": {
        "id": 1,
        "name": "The lord of the rings",
        "price": 90.5,
        "imgUrl": null,
        "categories": [
          {
            "id": 2,
            "name": "Books"
          }
        ],
        "description": "An epic fantasy journey to destroy a powerful ring"
      }
    },
    {
      "quantity": 1,
      "price": 1250,
      "subTotal": 1250,
      "product": {
        "id": 3,
        "name": "Macbook Pro",
        "price": 1250,
        "imgUrl": null,
        "categories": [
          {
            "id": 3,
            "name": "Computers"
          }
        ],
        "description": "High-performance laptop by Apple"
      }
    }
  ],
  "payment": {
    "id": 1,
    "moment": "2024-06-20T06:45:33Z"
  },
  "total": 1431
}
```

## Author

- <a href="https://www.linkedin.com/in/kauahaymon/" target="_blank" rel="noopener noreferrer">Kauã Haymon</a> no LinkedIn.</p>

## Thanks to

- Programming school: [DevSuperior](https://devsuperior.com.br/)!
- Professor: [Nélio Alves](https://www.linkedin.com/in/nelio-alves/)!
