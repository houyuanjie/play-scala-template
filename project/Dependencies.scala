import sbt.*

object Dependencies {
  lazy val h2                = "com.h2database"          % "h2"                 % "2.2.224"
  lazy val quill             = "io.getquill"            %% "quill-jdbc"         % "4.8.4"
  lazy val scalaTestPlusPlay = "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1"
}
