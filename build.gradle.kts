plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
}

group = "io.github.sh1sh4k1n9"
version = "0.1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

// License: Apache License 2.0
// Copyright 2025 sh1sh4k1n9

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-context:${property("springVersion")}")
    implementation("org.springframework:spring-core:${property("springVersion")}")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    
    testImplementation("org.springframework:spring-test:${property("springVersion")}")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
