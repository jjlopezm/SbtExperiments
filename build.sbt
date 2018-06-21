import Dependencies._

val versionBuild = "0.1.0-SNAPSHOT"
val scalaVersionBuild = "2.12.6"
val organizationName ="com.avertia"

resolvers +=
  "Nexus" at "http://nexus.avertiadesarrollo.es:8081/repository/AvertiaRepository/"

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

updateOptions := updateOptions.value.withGigahorse(false)

coverageEnabled := true

coverageMinimum := 80
coverageFailOnMinimum := true

publishTo := {
  val nexus = "http://nexus.avertiadesarrollo.es:8081/repository/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "AvertiaSnapshot/")
  else
    Some("releases"  at nexus + "AvertiaRelease")
}

  lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := organizationName,
      scalaVersion := scalaVersionBuild,
      version := versionBuild
    )),
    name := "MyFirstSbtScala",
    organization := "com.avertia",
    mainClass in assembly := Some("com.avertia.rational.RationalCalculator"),
    assemblyJarName in assembly := s"AvertiaRational.jar",
    libraryDependencies ++= Seq(
      scalaTest % "test"
    )
  )

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case _ => MergeStrategy.first
}