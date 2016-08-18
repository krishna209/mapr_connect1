name := """mapr_connect1"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "Mapr Releases" at "http://repository.mapr.com/maven/",
  Resolver.sonatypeRepo("releases"),
  Resolver.jcenterRepo
)

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.apache.hbase"%"hbase-client"%"1.1.1-mapr-1602-m7-5.1.0",
  "org.apache.hbase"%"hbase-common"%"1.1.1-mapr-1602-m7-5.1.0",
  "org.apache.hadoop"%"hadoop-common"%"2.7.0-mapr-1602",
  "com.mapr.fs"%"mapr-hbase"%"5.1.0-mapr"
)

fork in run := true