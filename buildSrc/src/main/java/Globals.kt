import org.gradle.api.JavaVersion

object Globals {
  object Project {
    const val version = "1.0.0-SNAPSHOT"
    const val groupId = "com.github.daggerok"
    const val artifactId = "jvm-languages-and-features-comparison"
  }

  val javaVersion = JavaVersion.VERSION_11

  const val scalaVersion = "2.12.8"
  const val scalacticVersion = "2.12:3.2.0-SNAP10"
  const val scalatestVersion = "2.12:3.2.0-SNAP10"

  const val groovyVersion = "3.0.0-beta-1"
  const val kotlinVersion = "1.3.31"

  const val junitVersion = "4.13-beta-3"
  const val junitJupiterVersion = "5.5.0-M1"

  object Gradle {
    const val wrapperVersion = "5.4.1"

    object Plugin {
      const val versionsVersion = "0.21.0"
    }
  }
}
