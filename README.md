## Integrantes

* **Lucas Neves**

## Sobre o Projeto

Este projeto é uma **Aplicação Web MVC** desenvolvida para uma Agência de Viagens. O sistema gerencia reservas de pacotes turísticos, utilizando **Java**, **Spring Boot** e persistência de dados com **MongoDB**.

Diferente de uma API pura, este projeto utiliza **Spring MVC** para renderizar páginas HTML (via Thymeleaf) diretamente para o usuário, permitindo listar, visualizar e criar novas reservas através do navegador.

## Tecnologias Utilizadas

* **Java 17/21**
* **Spring Boot** (Web, Data MongoDB)
* **MongoDB** (Banco de Dados NoSQL)
* **Thymeleaf** (Motor de Template para gerar o HTML)
* **HTML/CSS** (Interface do usuário)

## Estrutura de Dados (Model)

O objeto principal do sistema é a **Reserva**, composta pelos seguintes campos no MongoDB:

* **cliente:** Nome do cliente (String)
* **pacote:** Nome do pacote de viagem (String)
* **valor:** Preço da reserva (Double)
* **data_saida:** Data da viagem (LocalDate)
* **status:** Situação da reserva (String)

## Rotas e Funcionalidades

O sistema funciona através de rotas de navegador:

### 1. Página Inicial
* **URL:** `/`
* **Descrição:** Exibe o menu principal da agência.

### 2. Listagem de Reservas
* **URL:** `/reservas`
* **Ação:** Consulta o banco de dados (MongoDB) e exibe uma tabela com todos os pacotes vendidos.
* **View:** `reservas-lista.html`

### 3. Detalhes da Reserva
* **URL:** `/reservas/{id}
* **Ação:** Busca uma reserva específica pelo ID e mostra os detalhes completos.
* **View:** `reserva-detalhe.html`

### 4. Nova Reserva
* **URL:** `/reservas/nova`
* **Ação:** Exibe o formulário para cadastro de vendas.
* **View:** `reserva-formulario.html`

## Como Rodar

1.  Certifique-se de ter o **MongoDB** rodando localmente ou configurado no `application.properties`.
2.  Clone o repositório.
3.  Execute a classe principal da aplicação.
4.  Acesse no navegador: `http://localhost:8080` (ou a porta configurada).
