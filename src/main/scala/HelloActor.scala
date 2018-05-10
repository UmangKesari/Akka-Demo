import akka.actor.Actor

class HelloActor extends Actor {

  override def receive: Receive = {
    case "hello" => println("World")

    case _ => println("error message")
  }

}
