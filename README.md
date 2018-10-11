# Projeto

## Tecnologias e frameworks

* java 8
* spring boot
* orika (framework para mapeamento de objetos: DTO to Entity e  Entity to DTO)
* swagger para documentação da api rest
* actuator (medir a saúde da aplicação e disponibilizar métricas)
* Mockito para mockar objetos durante os testes unitários
* Angular (front-end)

## Rodando o projeto

Após fazer o download do código, faça o seguinte:

```
cd desafio
mvn clean install
cd target
java -jar desafio-1.0.0-SNAPSHOT.jar

cd../desafio-web
ng serve

OU

cd desafio
docker build -t marcos/desafio-core .

cd../desafio-web
docker build -t marcos/desafio-web .

docker-compose up -d

```
## Teste Frontend

Acessar a url http://localhost:4200

## Teste Backend

Você pode testar de duas formas:

1- via web acessando o swagger http://localhost:8081/swagger-ui.html
Nesta opção aparecerá uma tela web para que você possa inserir os dados a partir de um formulário.

2- via terminal linux através do comando curl: 
 
 Exemplo GET:
 
 ```
curl -X GET --header 'Accept: application/json' 'http://localhost:8081/account/launch'
 ```
 
 Actuator - Métricas referente a aplicação
 
 ```
 curl -X GET --header 'Accept: application/json' 'http://localhost:8081/metrics'
 
 curl -X GET --header 'Accept: application/json' 'http://localhost:8081/health'
 
 curl -X GET --header 'Accept: application/json' 'http://localhost:8081/trace'
 
 curl -X GET --header 'Accept: application/json' 'http://localhost:8081/info'
 ```

 ## Próximos passos
 
 * Preparar ambiente de CI (Continuos Integration) e CD (Continuos Delivery)
 * Utilização de tecnologias/ferramentas como: 
 	* Jenkins (criação de pipeline e automatização de processos de integração e entrega)
 	* Nexus (para armazenamento de imagens docker)
 	* Sonar (para uma análise de código mais detalhada)
	* Log e monitoração (aqui podemos usar um splunk, Stack ELK, etc)
	* Administração de containers
