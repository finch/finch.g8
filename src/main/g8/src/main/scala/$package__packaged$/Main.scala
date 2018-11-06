package $package$

import cats.effect.IO
import com.twitter.finagle.Http
import com.twitter.util.Await
import io.finch._
import io.finch.catsEffect._

object Main extends App {

  def helloWorld: Endpoint[IO, String] = get("hello") {
    Ok("Hello, World!")
  }

  def hello: Endpoint[IO, String] = get("hello" :: path[String]) { s: String =>
    Ok("Hello, " + s + "!")
  }

  Await.ready(
    Http.server
      .serve(":8081", (hello :+: helloWorld).toServiceAs[Text.Plain])
  )
}