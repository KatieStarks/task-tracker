FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/task-tracker.jar /task-tracker/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/task-tracker/app.jar"]
