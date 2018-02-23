import mill._
import mill.scalalib._

object hello extends ScalaModule {
  override def scalaVersion = "2.12.4"
  override def ivyDeps = Agg(
    ivy"org.java-websocket:Java-WebSocket:1.3.7",
    ivy"org.scala-lang:scala-reflect:${scalaVersion()}"
  )
}
