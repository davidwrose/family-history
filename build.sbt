lazy val root = project.in(file("."))
  .settings(
    inThisBuild(List(
      scalaVersion := "3.4.0"
    )),
         name := "Family History", version := "0.0-SNAPSHOT",
         fork := true)

libraryDependencies += "org.typelevel" %% "cats-core" % "2.10.0"
libraryDependencies += "org.typelevel" %% "cats-effect" % "3.5.4"
libraryDependencies += "org.typelevel" %% "cats-parse" % "0.3.9"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test"
