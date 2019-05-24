rootProject.name = Globals.Project.artifactId

pluginManagement {
  repositories {
    gradlePluginPortal()
  }
}

include(
    ":java-language",
    ":scala-language",
    ":groovy-language",
    ":kotlin-language"
)
