name := "CrazyPassenger"

version := "1.0"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.9.4" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")