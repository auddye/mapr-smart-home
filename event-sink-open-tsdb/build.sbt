lazy val eventOpenTSDBSink = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.mapr.demos",
      scalaVersion := "2.11.6",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "Event Open TSDB Sink",
    resolvers += "mapr-releases" at "http://repository.mapr.com/maven/",
    resolvers += "JBoss 3rd-party" at "https://repository.jboss.org/nexus/content/repositories/thirdparty-releases/",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % Test,
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.8",
    libraryDependencies += "commons-logging" % "commons-logging" % "1.2",
    libraryDependencies +=  "com.mapr.streams" % "mapr-streams" % "6.0.0-mapr"
)
