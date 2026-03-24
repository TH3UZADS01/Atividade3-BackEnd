# 📌 API Contato - Spring Boot

## 📖 Sobre o projeto

API REST desenvolvida com **Spring Boot** que permite **criar e listar contatos**, utilizando métodos HTTP.

---

## 🚀 Tecnologias utilizadas

* Java
* Spring Boot
* Maven
* Postman

---

## 🔗 Endpoints

### 📥 GET /contato

Lista todos os contatos cadastrados.

### 📤 POST /contato

Cria um novo contato.

#### Exemplo de JSON:

```json
{
  "nome": "Matheus",
  "telefone": "99999-9999"
}
```

---

## ▶️ Como executar

```bash
git clone https://github.com/TH3UZADS01/Atividade3-BackEnd
cd Atividade3-BackEnd
mvn spring-boot:run
```

A API estará em:

```
http://localhost:8080/contato
```

---

## 🧪 Testes

Utilize o **Postman**:

* POST → cria contato
* GET → lista contatos

---

## ⚠️ Observação

Os dados são armazenados em memória, ou seja, são perdidos ao reiniciar a aplicação.

---

## 👨‍💻 Autor

Projeto desenvolvido para atividade acadêmica.
