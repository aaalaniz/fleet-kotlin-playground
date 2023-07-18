plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.20"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.google.truth:truth:1.1.4")
    testImplementation("junit:junit:4.13")
    testImplementation("com.google.testparameterinjector:test-parameter-injector:1.12")
}


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set("playground.kotlin.AppKt")
}
