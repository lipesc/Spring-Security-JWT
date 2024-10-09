<h1 align="left">
  Spring Security JWT
</h1>

Implementando uma autenticação e autorização com Spring Security e JWT.

# Tecnologias usadas
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Security](https://spring.io/projects/spring-security)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [H2](https://www.h2database.com)


inicie a aplicação fazer um post no endpoint /authenticate vai gerar um token jwt com esse token
um get na rota /private

usando Insomnia:

obter o token JWT

Metodo: POST
```
URL: http://localhost:8080/authenticate
body:
json
{
  "username": "username",
  "password": "password"
}
```
(GET/private):
```
Método: GET
URL: http://localhost:8080/privado
Authentication: Bearer Token e cole o token JWT
```