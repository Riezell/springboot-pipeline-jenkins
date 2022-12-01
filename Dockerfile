FROM openjdk:11
COPY /target/spring-with-aws.jar .
CMD ["java","-jar","spring-with-aws.jar"]