# Projeto

## Tecnologias e frameworks

* java 8
* spring boot
* orika (framework para mapeamento de objetos: DTO to Entity e  Entity to DTO)
* swagger para documentação da api rest
* actuator (medir a saúde da aplicação e disponibilizar métricas)
* Mockito para mockar objetos durante os testes unitários

## Rodando o projeto

Após fazer o download do código, faça o seguinte:

```
mvn clean install
cd target
java -jar desafio-1.0.0-SNAPSHOT.jar
```

## Teste

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
 	* Docker (criar imagem docker do projeto para entrega)
 	* Nexus (para armazenamento de imagens docker)
 	* Sonar (para uma análise de código mais detalhada)