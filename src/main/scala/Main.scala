
import kamon.Kamon
import scala.concurrent.duration._

object Main extends App {
  Kamon.start()

  sys.addShutdownHook {
    Kamon.shutdown()
  }

  private val requestCounter = Kamon.metrics.counter("request")

  for(i <- 1 to 10) {
    println(s"i: $i")
    requestCounter.increment(87)
    Thread.sleep(500)
  }
  val stopFuture = Kamon.shutdown()
  println("done")
}
