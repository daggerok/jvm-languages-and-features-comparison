plugins {
    groovy
}

sourceSets {
    main {
        java.srcDir("src/main/groovy")
    }
    test {
        java.srcDir("src/test/groovy")
    }
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:${Globals.groovyVersion}")
}
