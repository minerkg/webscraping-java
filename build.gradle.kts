plugins {
    id("java")
}

group = "org.csiszer.webscraping"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.seleniumhq.selenium:selenium-java:4.19.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.2")

}

tasks.test {
    useJUnitPlatform()
}