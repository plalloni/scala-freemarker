name := "scala-freemarker"

organization := "plalloni"

version := "1.0"

scalaVersion := "2.10.1"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= Seq(
  "org.freemarker" % "freemarker" % "2.3.18",
  "commons-beanutils" % "commons-beanutils" % "1.8.3"
)

libraryDependencies ++= Seq(
  "org.scala-tools.testing" %% "specs" % "1.6.9",
  "commons-io" % "commons-io" % "2.1",
  "org.apache.commons" % "commons-lang3" % "3.1"
) map (_ % "test")
