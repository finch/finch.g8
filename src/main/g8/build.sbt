val finchVersion = "$finch_version$"
val scalatestVersion = "$scalatest_version$"

lazy val root = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name;format="norm"$",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "$scala_version$",
    libraryDependencies ++= Seq(
      "com.github.finagle" %% "finchx-core"  % finchVersion,
      "org.scalatest"      %% "scalatest"    % scalatestVersion % "test"
    )
  )