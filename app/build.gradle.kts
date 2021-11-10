plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.0"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("com.google.guava:guava:30.1.1-jre")

    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
}

application {
    mainClass.set("controller.App")
    applicationName = "canvas-challenge-kotlin"

}

tasks.test {
    useJUnitPlatform()
}

val run: JavaExec by tasks
run.standardInput = System.`in`