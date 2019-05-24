plugins {
    java
    scala
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

sourceSets {
    main {
        java.srcDir("src/main/scala")
    }
    test {
        java.srcDir("src/test/scala")
    }
}

dependencies {
    implementation("org.scala-lang:scala-library:${Globals.scalaVersion}")
    testImplementation("org.scalactic:scalactic_${Globals.scalacticVersion}")
    testImplementation("org.scalatest:scalatest_${Globals.scalatestVersion}")
}
