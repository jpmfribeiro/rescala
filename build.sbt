val breeze = "org.scalanlp" %% "breeze" % "0.12"
val breezeNatives = "org.scalanlp" %% "breeze-natives" % "0.12"

lazy val commonSettings = Seq(
  organization := "rescala",
  version := "1.0",
  scalaVersion := "2.10.5"
)

lazy val rescala = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "rescala",
    libraryDependencies += breeze,
    libraryDependencies += breezeNatives
  )