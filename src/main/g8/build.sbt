import Dependencies._

ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name;format="norm"$",
    libraryDependencies ++= Dependencies.buildDeps ++ Dependencies.testDeps
  )