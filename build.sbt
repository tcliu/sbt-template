name := baseDirectory.value.name

version := "1.0"

scalaVersion := "2.11.8"

EclipseKeys.withSource := true

val sourceMainDirs = Seq(
  "src/main/java",
  "src/main/scala",
  "src/main/resources"
)

val sourceTestDirs = Seq(
  "src/test/java",
  "src/test/scala",
  "src/test/resources"
)

val initDirs = (sourceMainDirs ++ sourceTestDirs).map(file).foreach(_.mkdirs)

libraryDependencies ++= Seq(
  "org.springframework" % "spring-core" % "4.3.2.RELEASE",
  "org.apache.commons" % "commons-lang3" % "3.4",
  "org.slf4j" % "slf4j-api" % "1.7.21",
  "ch.qos.logback" % "logback-classic" % "1.1.7" % "runtime",
  "junit" % "junit" % "4.12" % "test"
)
