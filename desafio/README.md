# Projeto

## Tecnologias e frameworks

* java 8
* spring boot
* spring data
* orika (framework para mapeamento de objetos: DTO to Entity e  Entity to DTO)
* hibernate validator
* swagger para documentação da api rest
* actuator (medir a saúde da aplicação e disponibilizar métricas)
* H2 para banco de dados
* Mockito para mockar objetos durante os testes unitários

## Rodando o projeto

Após fazer o download do código, faça o seguinte:

```
mvn clean install
cd target
java -jar properties-1.0.0-SNAPSHOT.jar
```

## Teste

Você pode testar de duas formas:

1- via web acessando o swagger http://localhost:8080/swagger-ui.html
Nesta opção aparecerá uma tela web para que você possa inserir os dados a partir de um formulário.

2- via terminal linux através do comando curl: 

Exemplo POST:

```
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{ 
   "baths": 2, 
   "beds": 3, 
   "description": "teste", 
   "price": 455000, 
   "squareMeters": 87, 
   "title": "teste", 
   "x": 500, 
   "y": 800 
 }' 'http://localhost:8080/properties'
 ```
 
 Exemplo GET:
 
 ```
curl -X GET --header 'Accept: application/json' 'http://localhost:8080/properties/1'
 
curl -X GET --header 'Accept: application/json' 'http://localhost:8080/properties/?ax=0&ay=1000&bx=600&by=500'
 ```
 
 Actuator - Métricas referente a aplicação
 
 ```
 curl -X GET --header 'Accept: application/json' 'http://localhost:8080/metrics'
 
 curl -X GET --header 'Accept: application/json' 'http://localhost:8080/health'
 
 curl -X GET --header 'Accept: application/json' 'http://localhost:8080/trace'
 
 curl -X GET --header 'Accept: application/json' 'http://localhost:8080/info'
 ```
 
 ## Próximos passos
 
 * Preparar ambiente de CI (Continuos Integration) e CD (Continuos Delivery)
 * Utilização de tecnologias/ferramentas como: 
 	* Jenkins (criação de pipeline e automatização de processos de integração e entrega)
 	* Docker (criar imagem docker do projeto para entrega)
 	* Nexus (para armazenamento de imagens docker)
 	* Sonar (para uma análise de código mais detalhada)