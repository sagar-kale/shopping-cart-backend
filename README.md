# shopping-cart-backend
shopping cart back-end with spring boot mongo db


## Prerequisits

Tools : 

1. Java 1.8 or above
2. Mongo DB
3. Apache Maven

Clone this repository - > `git clone https://github.com/sagar-kale/shopping-cart-backend`

Install maven and java , set JAVA_HOME, MAVEN_HOME in order to run backend api


## Development server

Run `cd  shopping-cart-backend`

Run `mvn spring-boot:run` for a dev server. Navigate to `http://localhost:8080/api`. 

The api need data to feed , in resources folder you'll find an json copy it and feed to `http://localhost:8080/api/addWarehouse`.
Make sure content type should be `application/json`.

You are good to go :)
