import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import org.gradle.api.tasks.testing.logging.TestLogEvent.*

plugins {
  java
  idea
  eclipse
  id("com.github.ben-manes.versions") version Globals.Gradle.Plugin.versionsVersion
}

allprojects {
  version = Globals.Project.version
  group = Globals.Project.groupId

  apply(plugin = "base")

  repositories {
    mavenCentral()
  }

  tasks {
    getByName("clean") {
      doLast {
        delete(
            project.buildDir,
            "${project.projectDir}/out"/*,
            "${project.projectDir}/buildSrc/build"*/
        )
      }
    }
  }
}

subprojects {
  apply(plugin = "java")

  sourceSets {
    main {
      java.srcDir("src/main/java")
    }
    test {
      java.srcDir("src/test/java")
    }
  }

  java {
    sourceCompatibility = Globals.javaVersion
    targetCompatibility = Globals.javaVersion
  }

  configure<JavaPluginConvention> {
    sourceCompatibility = Globals.javaVersion
    targetCompatibility = Globals.javaVersion
  }

  repositories {
    mavenCentral()
  }

  dependencies {
    testImplementation("junit:junit:${Globals.junitVersion}")
    testImplementation(platform("org.junit:junit-bom:${Globals.junitJupiterVersion}"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine")
    testRuntime("org.junit.platform:junit-platform-launcher")
  }

  tasks {
    withType<Test> {
      useJUnitPlatform()
      testLogging {
        showExceptions = true
        showStandardStreams = true
        events(PASSED, SKIPPED, FAILED)
      }
    }
  }
}

tasks {
  withType<Wrapper> {
    gradleVersion = Globals.Gradle.wrapperVersion
    distributionType = Wrapper.DistributionType.BIN
  }

  // gradle dependencyUpdates -Drevision=release --parallel
  named<DependencyUpdatesTask>("dependencyUpdates") {
    resolutionStrategy {
      componentSelection {
        all {
          val rejected = listOf("alpha", "beta", "rc", "cr", "m", "preview", "b", "ea", "SNAPSHOT")
              .map { qualifier -> Regex("(?i).*[.-]$qualifier[.\\d-+]*") }
              .any { it.matches(candidate.version) }
          if (rejected) reject("Release candidate")
        }
      }
    }
  }
}

defaultTasks(/*"clean", */"build")
