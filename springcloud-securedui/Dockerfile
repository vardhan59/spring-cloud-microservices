FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD  target/springcloud-secureduims-0.0.1-SNAPSHOT.jar secureduims.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/secureduims.jar"]