# Spring Boot Microservice Example Project for GCI Homework

This is a sample Java / Maven / Spring Boot application that allows the user to see a list of contracts, defined per the requirements of the assignment

## How to Run 

####Note: this application currently doesn't run as there is a bean autowire issue that I am having difficulty resolving

* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 3.6
* You can build the project and run the tests by running ```mvn clean package```
* Once successfully built, you can run the service by opening the project in your preferred IDE and running the application


## Here is what this application demonstrates: 

This is intended to be a simple GET-only API to see various types of contracts and associated invoices.


## Challenges faced when I developed this project:

* I've never used Spring boot and Maven before (my previous experience with Maven was done with vanilla Spring) and got tripped up for a bit trusting the auto-imports IntelliJ suggested.

* I initially intended to develop this application using PostgreSQL and Liquibase to auto-populate some data, but I've never done this from scratch/without working from an existing design pattern and this ended up taking too much of my time. As a result, I went ahead and used an H2 database, which I also hadn't ever developed from scratch before, but proved to be much easier for my purposes.





## Things I would have added to this application if given more time/if it was ever to be used in a real-world context

* Swagger: Implementing Swagger would allow easy transparency into what each endpoint of the API does.

* Logging: This application doesn't incorporate any logging to document which endpoints are being hit/how often. Adding Zipkin for tracing would be ideal so I could identify troublesome or slow API calls.

* Security: Using plaintext usernames and passwords is never a good idea, but it's quick in a POC app.

* Exception Handling: I haven't set this up to handle exceptions with any useful errors yet.

* Testing: I'd have preferred to do this in a TDD fashion, but I was experimenting with how I wanted to set this up on the fly, so I intended to write tests afterwards but ran out of time.



### Here's the list of endpoints you can call:

```
http://localhost:8080/contracts for all contracts
http://localhost:8080/contracts/lineItems for all line item contracts
http://localhost:8080/contracts/lineitems/{id} for a specific line item contract
http://localhost:8080/contracts/serviceOrders for all service order contracts
http://localhost:8080/contracts/serviceOrders/{id} for a specific service order contract 
http://localhost:8080/contracts/serviceAgreements for all service agreement contracts
http://localhost:8080/contracts/serviceAgreements/{id} for a specific service agreement contract
http://localhost:8080/invoices for all invoices
http://localhost:8080/invoices/{id} for a specific invoice