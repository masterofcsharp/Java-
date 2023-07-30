// <dependency>
//     <groupId>org.awaitility</groupId>
//     <artifactId>awaitility</artifactId>
//     <version>3.1.2</version>
//     <scope>test</scope>
// </dependency>

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
https://maven.apache.org/xsd/maven-4.0.0.xsd>
        <modelVersion>4.0.0</modelVersion>
        <parent>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-parent</artifactId>
                <version>3.1.0</version>
                <relativePath/>
        </parent>
        <groupId>com.example</groupId>
        <artifactId>scheduling-tasks-complete</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <name>scheduling-tasks-complete</name>
        <description>Demo project for Spring Boot</description>

        <properties>
                <java.version>17</java.version>
        </properties>

        <dependencies>
                <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter</artifactId>
                </dependency>
                <dependency>
                        <groupId>org.awaitility</groupId>
                        <artifactId>awaitility</artifactId>
                        <version>4.2.0</version>
                        <scope>test</scope>
                </dependency>

                <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-test</artifactId>
                        <scope>test</scope>
                </dependency>
            </dependencies>
        <build>
                <plugins>
                        <plugin>
                                <groupId>org.springframework.boot</groupId>
                                <artifactId>spring-boot-maven-plugin</artifactId>
                        </plugin>
                </plugins>
        
</project>