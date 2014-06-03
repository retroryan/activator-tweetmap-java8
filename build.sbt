name := "tweetmap-java8"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaWs,
  "org.webjars" % "bootstrap" % "3.0.0",
  "org.webjars" % "angularjs" % "1.2.16",
  "org.webjars" % "angular-leaflet-directive" % "0.7.6",
  "com.typesafe.akka" %% "akka-actor" % "2.3.3",
  "com.typesafe.akka" %% "akka-contrib" % "2.3.3",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.3" % "test"
)

scalaVersion := "2.11.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava, SbtWeb)