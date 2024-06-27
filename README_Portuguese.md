# Aplicação de Serviço Web

[![NPM License](https://img.shields.io/npm/l/react)](https://github.com/kauahaymon/webservice-springboot3-jpa/blob/main/LICENSE)

## Sobre o projeto

- Este projeto é uma aplicação web de e-commerce totalmente funcional, construída usando Spring Boot e JPA / Hibernate.
- Demonstra a implementação de um **modelo de domínio** completo, **arquitetura em camadas**, **configuração de banco de dados** e operações **CRUD**, tudo isso enquanto lida com **exceções de forma eficaz**.

## Modelo de Domínio

![Domain](https://github.com/kauahaymon/illustrative-images/blob/master/Class1.svg)

## Esquema do Banco de Dados

![schema](https://github.com/kauahaymon/illustrative-images/blob/master/schema%20diagram.svg)

## Tecnologias Utilizadas

### Back end

- Java
- Spring Boot
- JPA / Hibernate
- Maven

### Implantação em Produção

- Back end: [Render](render.com)
- Banco de dados: PostgreSQL
- Testes: H2, Postman

## Habilidades Demonstradas

- Arquitetura em Camadas
- Docker

## Demonstração de requisição de pedido

Corpo de uma solicitação de pedido de cliente:

Link: [Pedido 1](https://webservice-springboot3-jpa.onrender.com/orders/1)

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
