FROM openjdk:11
EXPOSE 9020
ADD target/springbootdockerdemoexample.jar springbootdockerdemoexample.jar
ENTRYPOINT ["java","-jar","/springbootdockerdemoexample.jar"]