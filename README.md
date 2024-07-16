
---

# ForumHub API 🌐

Bem-vindo ao ForumHub API, onde você pode gerenciar tópicos, cursos e usuários através de uma API RESTful baseada em Spring.

## Visão Geral 🌎
O FórumHub é uma aplicação backend desenvolvida em Spring que replica as funcionalidades de um fórum online. Os usuários podem interagir com a API para criar, visualizar, atualizar e deletar tópicos. A implementação segue as melhores práticas de desenvolvimento RESTful, utilizando validações de regras de negócio, integração com banco de dados relacional, e serviços de autenticação/autorização para garantir a segurança dos dados.
## Endpoints Disponíveis 🚀

### Usuários 👤
- **GET /usuarios/{id}**: Retorna detalhes de um usuário específico.
- **PUT /usuarios/{id}**: Atualiza informações de um usuário específico.
- **DELETE /usuarios/{id}**: Remove um usuário específico.
- **GET /usuarios**: Lista todos os usuários.
- **POST /usuarios**: Cria um novo usuário.
- **POST /usuarios/login**: Endpoint para autenticação de usuários.

### Tópicos 📝
- **GET /topicos/{id}**: Retorna detalhes de um tópico específico.
- **PUT /topicos/{id}**: Atualiza informações de um tópico específico.
- **DELETE /topicos/{id}**: Remove um tópico específico.
- **GET /topicos**: Lista todos os tópicos.
- **POST /topicos**: Cria um novo tópico.

### Cursos 📘
- **GET /cursos/{id}**: Retorna detalhes de um curso específico.
- **PUT /cursos/{id}**: Atualiza informações de um curso específico.
- **DELETE /cursos/{id}**: Remove um curso específico.
- **GET /cursos**: Lista todos os cursos.
- **POST /cursos**: Cria um novo curso.

## Esquemas de Dados (Schemas) 📋

- **UsuarioAtualizacaoDTO**: DTO para atualização de informações de usuário.
- **TopicoAtualizacaoDTO**: DTO para atualização de informações de tópico.
- **CursoAtualizacaoDTO**: DTO para atualização de informações de curso.
- **UsuarioCadastroDTO**: DTO para cadastro de novo usuário.
- **UsuarioAutenticacaoDTO**: DTO para autenticação de usuário.
- **CursoDTO**: DTO para representação de informações de curso.
- **TopicoCadastroDTO**: DTO para cadastro de novo tópico.
- **UsuarioDTO**: DTO para representação detalhada de usuário.
- **CursoCadastroDTO**: DTO para cadastro de novo curso.
- **Pageable**: Objeto para paginação.
- **PageTopicoDTO**: DTO para representação de página de tópicos.
- **PageableObject**: Objeto para paginação genérico.
- **SortObject**: Objeto para ordenação de resultados.
- **TopicoDTO**: DTO para representação detalhada de tópico.

## Configuração do Banco de Dados Local 🛠️

Para configurar o banco de dados localmente:

1. **Instalação do MySQL**: Instale o MySQL no seu sistema.
2. **Criação do Banco de Dados**: Crie um banco de dados com o nome `forumhub`.
3. **Configuração de Conexão**: Configure as credenciais do banco de dados no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/forumhub
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```
## Configuração do JWT_SECRET 🔐

Para configurar o JWT_SECRET:

1. **Definição do JWT_SECRET**: No arquivo `application.properties`, adicione a chave secreta JWT:

```properties
api.security.token.secret=SUA_CHAVE_SECRETA_AQUI
```


## Como Testar a API Usando Swagger 🧪

1. **Iniciar a Aplicação**: Execute a aplicação Spring Boot.
2. **Acessar o Swagger**: Abra o navegador e acesse `http://localhost:8080/swagger-ui.html`.
3. **Autenticação**: Clique no botão "Authorize" e insira o Bearer Token:

   ```
   Bearer SEU_TOKEN_AQUI
   ```

4. **Explorar os Endpoints**: Navegue pelos endpoints disponíveis no Swagger para testar as operações CRUD.

---
