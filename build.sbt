// Set your scala version here
val scalaVer = "2.12.3"

val commonSettings = Seq(
  version := "1.0",
  scalaVersion := scalaVer,
  organization := "com.scale360"
)

lazy val root = (project in file("."))
  .settings(commonSettings)

lazy val grade_students = (project in file("grade_students"))
  .settings(commonSettings)

lazy val word_count = (project in file("word_count"))
  .settings(commonSettings)