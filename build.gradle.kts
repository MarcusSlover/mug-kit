plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains:annotations:16.0.2")

    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")

    testCompileOnly("org.projectlombok:lombok:1.18.24")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.24")

    testCompileOnly("org.jetbrains:annotations:16.0.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
}


