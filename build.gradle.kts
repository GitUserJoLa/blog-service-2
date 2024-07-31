plugins {
    id("java")
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "org.jola.learning"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")//1.18.32

    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.2")

    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation
    implementation("org.springframework.boot:spring-boot-starter-validation:3.3.2")

//    //https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.3.2")

//    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security
//    implementation("org.springframework.boot:spring-boot-starter-security:3.3.2")

    // https://mvnrepository.com/artifact/org.postgresql/postgresql
    implementation("org.postgresql:postgresql:42.7.3")

    // https://mvnrepository.com/artifact/org.flywaydb/flyway-core
    implementation("org.flywaydb:flyway-core:10.16.0")

//    // https://mvnrepository.com/artifact/org.jooq/jooq
//    implementation("org.jooq:jooq:3.19.10")



    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.projectlombok:lombok:1.18.34")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.34")//1.18.32
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.boot:spring-boot-starter-web:3.3.2")
    testImplementation("org.springframework.boot:spring-boot-starter-validation:3.3.2")
//    testImplementation("org.springframework.boot:spring-boot-starter-data-jpa:3.3.2")
//    testImplementation("org.springframework.boot:spring-boot-starter-security:3.3.2")
    testImplementation("org.postgresql:postgresql:42.7.3")
    testImplementation("org.flywaydb:flyway-core:10.16.0")
//    testImplementation("org.jooq:jooq:3.19.10")
}

tasks.test {
    useJUnitPlatform()
}
