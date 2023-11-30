FROM openjdk: 17-alpine
ADD target/virat.jar virat.jar
ENTRYPOINT ["java","-jar","virat.jar"] 
EXPOSE 8080
