
name := "KamonSBTProject_0_6_7"

version := "0.1"

scalaVersion := "2.12.15"

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "0.6.7",
  "org.aspectj" % "aspectjweaver" % "1.8.10"
)

resolvers += "Kamon Repository" at "https://repo.kamon.io"
