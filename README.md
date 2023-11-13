#Interface de Programação de Aplicação (decision-api-service) criada com: 

-Java 17
-Spring boot: v3.1.4
-Maven
-JPA
-MSQL
-Lombok (minimizar o uso de código repetitivo)
-Spring Tool Suit 4 Launcher
-Postman

-> Interface com a responsabilidade de conectar duas plataformas, permitindo que se comuniquem com agilidade a trocar informações. No repositório DECISION-API-APP criado com Angular 15 pode ser usado para consumir este serviço do Backend através de ENDPOINT com permissão da configuração do Cors o usuário poderá cadastrar e listar o Usuário.

# Métodos:

GET, POST

#Cabeçalhos:

Origin

# Padrão de Projetos

Data Transfer Object - DTO, Transfer Object para o transporte de dados entre diferentes componentes de um sistema, diferentes instâncias ou processos de um sistema distribuído ou diferentes sistemas via serialização.

#Controladores:

UsuarioControle
@GetMapping("/lista-usuarios"), @PostMapping("/criar-usuario")

# application.properties

-Configurar Spring Datasource, Spring Data JPA e propriedades do aplicativo (como string secreta JWT ou tempo de expiração do token).

-Importante verificar a versão das dependências compatíveis e adicionar no pom.xml.

-Configurar Spring Datasource, JPA, propriedades do aplicativo

-Na pasta src/main/resources, abra application.properties e adicione as configurações.

-MYSQL
-spring.datasource.url=jdbc:mysql://localhost:3306/decision_api_server_01
-spring.datasource.username=root
-spring.datasource.password=xxxxxxx
-spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
-spring.jpa.generate-ddl=true
-spring.jpa.hibernate.ddl-auto=update
-server.port=8080
-spring.jpa.show-sql=true

#Modelos

-Teremos 1 tabelas no banco de dados: usuarios



