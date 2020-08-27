ADD customerdb.h2.db  /tmp/customerdb.h2.db

FROM java:8

EXPOSE 8080

ADD build/libs/EighthProjectSalesAccount-0.0.1-SNAPSHOT.jar EighthProjectSalesAccount-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","EighthProjectSalesAccount-0.0.1-SNAPSHOT.jar"]

