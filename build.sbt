import com.github.play2war.plugin._

name := "play_2_2_sample"

version := "1.0-SNAPSHOT"

Play2WarPlugin.play2WarSettings

Play2WarKeys.servletVersion := "3.0"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.postgresql" % "postgresql" % "9.3-1100-jdbc4"
)     

play.Project.playJavaSettings
