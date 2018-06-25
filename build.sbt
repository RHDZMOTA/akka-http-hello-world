import Dependencies._

enablePlugins(JavaAppPackaging)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.rhdzmota",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "akka-http-hello-world",
    libraryDependencies ++= {
      val akkaHttpVersion = "10.1.1"
      val configVersion = "1.3.1"
      val circeVersion = "0.9.3"
      val akkaVersion = "2.5.12"
      Seq(
        "com.typesafe" % "config" % configVersion,
        "io.circe" %% "circe-core" % circeVersion,
        "io.circe" %% "circe-parser" % circeVersion,
        "io.circe" %% "circe-generic" % circeVersion,
        "com.typesafe.akka" %% "akka-actor" % akkaVersion,
        "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
        "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion,
        "com.typesafe.akka" %% "akka-http-jackson" % akkaHttpVersion,
        "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion,
        scalaTest % Test
      )
    }
  )
