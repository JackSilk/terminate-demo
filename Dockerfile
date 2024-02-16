FROM openjdk:17.0.2-slim
COPY build/libs/terminate-demo-0.0.1-SNAPSHOT.jar terminate-demo-0.0.1.jar
ENTRYPOINT ["java","-jar","/terminate-demo-0.0.1.jar"]