FROM maven:latest
RUN mkdir /ONThiGK2
WORKDIR /ONThiGK2
COPY . .
CMD mvn spring-boot:run

