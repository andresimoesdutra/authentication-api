# API de Autenticação

## Tecnologias Utilizadas
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

Este projeto é uma API desenvolvida com **Java**, **Spring Boot** e **MySQL** como banco de dados. A autenticação e o controle de acesso são gerenciados com **Spring Security** e **JWT**.

Essa é a minha foi a minha primeira API REST criada utilizando **autenticação** e **autorização** em uma aplicação Spring.



## Sumário

- [Instalação](#instala%C3%A7%C3%A3o)
- [Configuração](#configura%C3%A7%C3%A3o)
- [Uso](#uso)
- [Endpoints da API](#endpoints-da-api)
- [Autenticação](#autentica%C3%A7%C3%A3o)
- [Banco de Dados](#banco-de-dados)

---

## Instalação

### 1. Clonar o repositório:

```sh
 git clone https://github.com/usuario/auth-api.git
```

### 2. Instalar dependências com Maven:

```sh
mvn clean install
```

### 3. Instalar o MySQL:

Certifique-se de ter o **MySQL** instalado e configurado.

---

## Uso

1. Iniciar a aplicação com Maven:

```sh
mvn spring-boot:run
```

2. A API estará acessível em:

```sh
http://localhost:8080
```

---

## Endpoints da API

A API disponibiliza os seguintes endpoints:

- `GET /produto` - Retorna a lista de produtos (disponível para usuários autenticados).
- `POST /produto` - Cadastra um novo produto (**apenas para ADMIN**).
- `POST /auth/login` - Realiza o login.
- `POST /auth/registrar` - Registra um novo usuário.

---

## Autenticação

A API utiliza **Spring Security** para controle de acesso. Os seguintes roles estão disponíveis:

- **USER** → Usuário padrão autenticado.
- **ADMIN** → Acesso administrativo para gestão de produtos.

Para acessar endpoints protegidos, forneça as credenciais de autenticação no cabeçalho da requisição.

---

## Banco de Dados

O projeto utiliza **MySQL** como banco de dados.
