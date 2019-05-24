# Compare JVM languages and features [![Build Status](https://travis-ci.org/daggerok/jvm-languages-and-features-comparison.svg?branch=master)](https://travis-ci.org/daggerok/jvm-languages-and-features-comparison)
Gradle Kotlin DSL for multi-module multi-language mono-repo
 
_requires jdk 11, or use jevn, like so:_

```bash
jenv local 11.0.2
alias setjdk11='export JAVA_HOME=$(/usr/libexec/java_home -v 11)'
setjdk11
java -version
gradle -v
```

_build and test_

```bash
./gradlew
```

inspired by this article: [Java vs. Groovy, Scala, Kotlin – Language Features Comparison of JVM Languages with code examples](http://itsallbinary.com/java-vs-groovy-scala-kotlin-code-comparison-of-jvm-languages/)
