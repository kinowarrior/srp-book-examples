name := "akka-dynamic-streams-scala-app"

version := "1.0.0"

scalaVersion := "2.12.4"

lazy val akkaVersion = "2.5.9"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion
)
