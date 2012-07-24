import sbt._
import sbt.Keys._

object ProjectEulerWithScalaBuild extends Build {

  lazy val projectEulerWithScala = Project(
    id = "project-euler-with-scala",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Project Euler with Scala",
      organization := "com.takashabe.pj_euler.scala",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      libraryDependencies ++= myLibraryDependecies,
      resolvers ++= myResolvers
    )
  )

  val myLibraryDependecies = Seq (
    "org.specs2" %% "specs2" % "1.11" % "test"
  )

  val myResolvers = Seq (
    "release" at "http://oss.sonatype.org/content/repositories/release"
  )
}
