name := "MockFactoryVsMockito"

version := "1.0"

lazy val `mockfactoryvsmockito` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )
libraryDependencies ++= Seq(
  "org.scalamock" %% "scalamock" % "5.1.0" % Test,
  "org.scalatest" %% "scalatest" % "3.2.5" % Test,
  "org.scalatestplus" %% "mockito-3-4" % "3.2.5.0"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

