
name := "KamonSBTProject_0_6_7"

version := "0.1"

scalaVersion := "2.12.15"

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "0.6.7",
  "org.aspectj" % "aspectjweaver" % "1.8.10",
  "ch.qos.logback" % "logback-classic" % "1.3.11" % "runtime",
  "org.logback-extensions" % "logback-ext-loggly" % "0.1.2",
  "ch.qos.logback.contrib" % "logback-json-classic" % "0.1.2",
  "ch.qos.logback.contrib" % "logback-jackson" % "0.1.2"
)

resolvers += "Kamon Repository" at "https://repo.kamon.io"
