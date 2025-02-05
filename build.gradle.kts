plugins {
	java
	id("org.springframework.boot") version "3.3.8"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.springframework.boot:spring-boot-starter-web")  // 웹 기능
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")  // JPA
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf") // Thymeleaf (HTML 뷰)
    runtimeOnly("org.mariadb.jdbc:mariadb-java-client")  // MariaDB 드라이버 (MySQL 대체 가능)
    implementation("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
