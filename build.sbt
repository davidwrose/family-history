lazy val root = project.in(file("."))
  .settings(
    inThisBuild(List(
      scalaVersion := "3.4.0"
    )),
         name := "Family History", version := "0.0-SNAPSHOT")

libraryDependencies += "org.typelevel" %% "cats-core" % "2.10.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test"





