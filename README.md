# help-request-producer
The askHelpMessageProducer project is a Spring Boot application that sends XML message received from an API to ActiveMQ using apache camel

Usage
Before running the application
 -Need to run activemq docker:
 -Apache ActiveMQ :docker run -p 61616:61616 -p 8161:8161 rmohr/activemq 
    apache ActiveMQ browse http://localhost:8161/admin/queues.jsp 
 -Build and run the project
