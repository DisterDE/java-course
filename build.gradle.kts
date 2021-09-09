plugins {
    kotlin("jvm") version "1.5.30"
}

group = "com.kachalov.gu.android"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}