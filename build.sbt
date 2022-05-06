ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

lazy val log4j2V     = "2.17.2"
lazy val scalatestV  = "3.2.12"
lazy val scalacheckV = "3.2.11.0"

lazy val root = (project in file(".")).settings(
  name := """mml-scala""",
  organization := "info.galudisu",
  homepage := Some(url("https://github.com/barudisshu/learning-fibers")),
  licenses := List("MIT" -> url("https://opensource.org/licenses/MIT")),
  developers := List(
    Developer(
      "barudisshu",
      "Galudisu",
      "galudisu@gmail.com",
      url("https://galudisu.info")
    )
  ),
  libraryDependencies ++= Seq(
    // log4j2
    "org.apache.logging.log4j" % "log4j-api" % log4j2V,
    "org.apache.logging.log4j" % "log4j-core" % log4j2V,
    "org.apache.logging.log4j" % "log4j-slf4j-impl" % log4j2V,
    // test
    "org.scalatest" %% "scalatest" % scalatestV % Test,
    "org.scalatestplus" %% "scalacheck-1-15" % scalacheckV % Test
  )
)
