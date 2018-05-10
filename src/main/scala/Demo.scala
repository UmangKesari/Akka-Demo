import akka.actor.{ActorSystem, Props}

object Demo extends App {

  def props = Props
  //Defines an Actor System
  val system = ActorSystem("HelloSystem")

  //create a child actor
  val helloActor = system.actorOf(Props[HelloActor], name = "hello")

  helloActor ! "hello"

}