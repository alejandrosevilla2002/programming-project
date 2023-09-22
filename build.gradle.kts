plugins {
	java
	id("org.springframework.boot") version "3.1.3"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.programing"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation ("org.modelmapper:modelmapper:2.4.3")
	implementation("org.flywaydb:flyway-core")
	runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	//swagger
	implementation ("io.springfox:springfox-swagger2:3.0.0")
	implementation( "io.springfox:springfox-swagger-ui:3.0.0")
	implementation ("io.springfox:springfox-boot-starter:3.0.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
