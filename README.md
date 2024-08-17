# CRUD DE LIVROS 📚
## Descrição
Este projeto foi desenvolvido utilizando, Java, Spring Framework, Spring Data para realizar a persistência de
dados e MongoDB como o banco de dados.
Nessa API é possivel o usuário realizar todas as operações CRUD de Criar, Ler, Atualizar e Excluir livros através dos 
Endpoints que vão estar acessiveis na porta [http://localhost:8080]().

## Endpoints


GET /books - Retorna informações de todos os livros
```java
[
	{
		"id": "1",
		"name": "Ultra-aprendizado",
		"author": "Scott Young",
		"category": "Personal development"
	},
	{
		"id": "2",
		"name": "Entendendo Algoritmos",
		"author": "Aditya Y. Bhargava",
		"category": "Programming"
	}
]
```
GET /books/{id} - Retorna informação do livro pelo ID
```java
{
	"id": "1",
	"name": "Ultra-aprendizado",
	"author": "Scott Young",
	"category": "Personal development"
}
```
POST /books - Insere livro no BD
```java
{
	"id": "2",
	"name": "Entendendo Algoritmos",
	"author": "Aditya Y. Bhargava",
	"category": "Programming"
}
```
PUT /books/{id} - Atualiza informações do livro pelo ID
```java
{
	"id": "2",
	"name": "Arquitetura Limpa",
	"author": "Robert C. Martin",
	"category": "Technology"
}
```
DELETE /books/{id} - Deleta o livro pelo ID

Deleta o livro e apresenta mensagem para o usuário de "Livro excluido com sucesso"

