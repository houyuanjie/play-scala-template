import Dependencies.*
import Versions.*

scalaVersion := scala3
name         := "play-scala-template"
organization := "org.example"
version      := "0.0.1"

enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  jdbc,
  evolutions,
  ws,
  guice,
  h2,
  quill,
  scalaTestPlusPlay % Test
)
