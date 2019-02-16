FROM openjdk:8
ADD build/libs/restaurantService.jar restaurantService.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "restaurantService.jar"]

