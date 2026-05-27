# Fullstack Java + PostgreSQL + Next.js Lab

Este repositório é um laboratório de estudos para desenvolver uma aplicação web fullstack usando:

- Java com Spring Boot no backend
- PostgreSQL como banco de dados
- Next.js com TypeScript no frontend

O objetivo principal não é apenas criar uma aplicação funcional, mas aprender backend, modelagem de banco, arquitetura e integração entre sistemas de forma progressiva.

---

## Objetivo do projeto

Construir uma aplicação web completa, evoluindo por fases, para praticar:

- modelagem de banco de dados;
- SQL e PostgreSQL;
- backend com Java e Spring Boot;
- criação de APIs REST;
- integração com frontend Next.js;
- autenticação;
- organização de código;
- boas práticas de arquitetura;
- testes;
- uso consciente de IA no desenvolvimento.

---

## Projeto base

A aplicação escolhida será um sistema de gestão de documentos e fluxos de assinatura eletrônica.

A ideia é permitir que o usuário consiga:

- cadastrar documentos;
- definir signatários e ordem de assinatura (livre ou sequencial);
- controlar o status de cada assinatura (pendente, assinado, recusado);
- registrar cada evento com auditoria completa;
- fazer upload do documento assinado;
- visualizar a linha do tempo do documento;
- garantir que um documento concluído não possa ser alterado.

A arquitetura será preparada para futura integração com a API de Assinatura Eletrônica do GOV.BR (OAuth 2.0 + PKCS#7), embora o MVP trabalhe com upload e validação manual de arquivos assinados.

---

## Stack

### Frontend

- Next.js
- TypeScript
- Tailwind CSS
- shadcn/ui

### Backend

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven

### Banco de dados

- PostgreSQL

### Ferramentas auxiliares

- Docker
- DBeaver ou pgAdmin
- Postman ou Insomnia
- dbdiagram.io
- GitHub Projects ou Issues

---

## Estratégia de estudo

A rotina ideal será de 1 hora por dia.

### Divisão diária

- 20 minutos de teoria
- 40 minutos de prática no projeto

A prioridade será aprender construindo, mas sempre entendendo o motivo de cada decisão técnica.

---

## Roadmap

### Fase 1 — Fundamentos de Java

Objetivo: entender a base da linguagem e orientação a objetos.

Estudar:

- classes;
- métodos;
- tipos;
- objetos;
- interfaces;
- encapsulamento;
- composição;
- herança;
- collections;
- `List`, `Set` e `Map`;
- streams básicos.

Entrega prática:

- pequeno sistema de tarefas no terminal.

---

### Fase 2 — PostgreSQL e modelagem de banco

Objetivo: aprender a pensar em dados antes de escrever código.

Estudar:

- tabelas;
- primary key;
- foreign key;
- relacionamentos 1:1, 1:N e N:N;
- normalização;
- constraints;
- índices;
- transactions;
- `SELECT`;
- `JOIN`;
- `GROUP BY`;
- `INSERT`;
- `UPDATE`;
- `DELETE`.

Entrega prática:

- modelagem inicial do sistema de assinaturas;
- criação das tabelas principais;
- queries para dashboard de documentos.

Entidades iniciais:

- `User`;
- `Document`;
- `DocumentVersion`;
- `Signer`;
- `SignatureRequest`;
- `SignatureEvent`;
- `AuditLog`.

---

### Fase 3 — Backend com Spring Boot

Objetivo: criar uma API REST estruturada.

Estudar:

- controllers;
- services;
- repositories;
- entities;
- DTOs;
- dependency injection;
- validações;
- tratamento de erros;
- Spring Data JPA;
- Hibernate;
- migrations.

Entrega prática:

```
POST /documents
POST /documents/{id}/signers
POST /documents/{id}/send-to-signature
POST /signature-requests/{id}/upload-signed-file
GET  /documents/{id}/status
GET  /documents/{id}/audit
```

Regras importantes:

- Controller não deve conter regra de negócio.
- Um documento só pode ser concluído se todos os signatários obrigatórios assinarem.
- Um documento publicado ou concluído não pode ser alterado, apenas cancelado ou substituído por nova versão.
- Cada assinatura gera uma nova versão do documento.
- Cada evento deve registrar data, usuário e ação.

---

### Fase 4 — Integração com Next.js

Objetivo: conectar o frontend ao backend Java.

Estudar:

- chamadas HTTP;
- organização de services no frontend;
- formulários;
- loading states;
- error states;
- validação;
- autenticação;
- CORS;
- cookies ou JWT.

Entrega prática:

- tela de criação de documento;
- tela de gerenciamento de signatários;
- dashboard de documentos por status;
- linha do tempo de um documento.

---

### Fase 5 — Arquitetura e refatoração

Objetivo: melhorar a qualidade do código.

Estudar:

- separação de responsabilidades;
- camadas da aplicação;
- organização por domínio;
- clean architecture sem fanatismo;
- design patterns básicos;
- tratamento centralizado de erros;
- paginação;
- filtros;
- logs;
- soft delete.

Entrega prática:

- refatorar backend;
- refatorar frontend;
- documentar decisões arquiteturais.

---

### Fase 6 — Recursos avançados

Objetivo: transformar o projeto em uma aplicação mais próxima de um produto real.

Funcionalidades possíveis:

- ordem obrigatória de assinatura;
- expiração de solicitações de assinatura;
- notificações por e-mail;
- geração de PDF do documento;
- validação de assinatura digital (PKCS#7);
- estudo e prototipação da integração com a API GOV.BR (OAuth 2.0);
- dashboards avançados;
- relatórios de auditoria exportáveis.

---

## Como usar IA neste projeto

A IA pode ser usada, mas não deve substituir o raciocínio.

O objetivo é usar IA como mentora, revisora e aceleradora, não como piloto automático.

---

### Quando posso usar IA

A IA pode ser usada para:

- explicar conceitos;
- revisar modelagens;
- comparar alternativas;
- apontar problemas no código;
- sugerir melhorias;
- gerar exemplos pequenos;
- explicar erros;
- ajudar a criar testes;
- revisar nomes de entidades;
- sugerir estrutura de pastas;
- explicar mensagens de erro;
- questionar decisões arquiteturais.

Exemplos de bons prompts:

Revise essa modelagem de banco e me diga onde ela pode gerar inconsistência.

Explique esse erro do Spring Boot e me mostre como investigar antes de corrigir.

Compare essas duas formas de modelar o fluxo de assinatura sequencial e diga os tradeoffs.

Me ajude a pensar quais responsabilidades devem ficar no service e quais devem ficar no controller.

---

### Quando evitar IA

Evitar usar IA para:

- gerar uma feature inteira sem eu entender;
- copiar código direto sem revisar;
- criar modelagem sem eu tentar antes;
- resolver exercícios de lógica sem esforço próprio;
- refatorar tudo automaticamente;
- tomar decisões arquiteturais sem justificativa.

## Regra pessoal:

Antes de pedir código para a IA, eu preciso tentar estruturar o problema sozinho.

---

### Método de desenvolvimento

## Para cada nova funcionalidade:

- Entender o problema.
- Desenhar a modelagem.
- Definir as entidades envolvidas.
- Criar ou alterar o banco.
- Criar as regras no backend.
- Expor a API.
- Integrar no frontend.
- Testar manualmente.
- Refatorar.
- Documentar o aprendizado.

---

## Convenção de branches

- `feature/nome-da-funcionalidade`
- `fix/nome-do-ajuste`
- `refactor/nome-da-refatoracao`
- `study/topico-estudado`

Exemplos:

```
feature/create-document
feature/signature-flow
study/postgres-transactions
refactor/backend-service-layer
```

---

## Diário de aprendizado

Cada fase deve conter uma pequena anotação em Markdown respondendo:

- O que eu aprendi?
- O que eu ainda não entendi bem?
- Que erro eu cometi?
- Como eu resolveria melhor da próxima vez?
- Onde a IA ajudou?
- Onde eu dependi demais da IA?

---

## Meta final

Ao final deste projeto, eu quero ser capaz de:

- modelar um banco relacional com segurança;
- escrever queries SQL úteis;
- criar uma API backend com Java e Spring Boot;
- integrar backend com Next.js;
- estruturar código por responsabilidade;
- tomar decisões técnicas melhores;
- usar IA sem perder autonomia técnica;
- evoluir como engenheiro de software fullstack.
