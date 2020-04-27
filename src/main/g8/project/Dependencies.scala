import sbt._

object Dependencies {
  lazy val finchVersion = "$finch_version$"
  lazy val circeVersion = "$circe_version$"
  lazy val scalatestVersion = "$scalatest_version$"

  lazy val buildDeps = Seq(
    "com.github.finagle" %% "finchx-core"  % finchVersion,
    "com.github.finagle" %% "finchx-circe"  % finchVersion,
    "io.circe" %% "circe-generic" % circeVersion
  )

  lazy val testDeps = Seq(
    "org.scalatest" %% "scalatest" % scalatestVersion,
    "org.scalactic" %% "scalactic" % scalatestVersion
  ).map(_ % Test)
}
