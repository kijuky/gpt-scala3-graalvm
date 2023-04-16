val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-graalvm",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

scalaVersion := "3.1.0"
Compile / mainClass := Some("com.example.Main")

// build.sbt
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case PathList("META-INF", xs @ _*) => MergeStrategy.first
  case _ => MergeStrategy.first
}
