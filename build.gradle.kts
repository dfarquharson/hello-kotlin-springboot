import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.dfarquharson.github.kotlin.springboot"
version = "1.0-SNAPSHOT"

plugins {
    val kotlinVersion = "1.3.11"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
    kotlin("kapt") version kotlinVersion
    id("org.springframework.boot") version "2.1.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.6.RELEASE"
    jacoco
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    // runtime
    compile(kotlin("stdlib-jdk8"))
    compile("org.springframework.boot:spring-boot-starter-webflux") {
        exclude(module = "hibernate-validator")
    }
    compileOnly("org.springframework:spring-context-indexer")
    compile("org.springframework.boot:spring-boot-devtools")
    kapt("org.springframework.boot:spring-boot-configuration-processor")

    // test
    testCompile("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "junit")
    }
    testCompile("org.assertj:assertj-core:3.11.1")
    val junitVersion = "5.3.2"
    testCompile("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testCompile("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

jacoco {
    toolVersion = "0.8.2"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Wrapper> {
    gradleVersion = "5.1.1"
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
