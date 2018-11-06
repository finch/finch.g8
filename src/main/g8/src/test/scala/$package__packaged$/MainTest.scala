package $package$

import io.finch._
import org.scalatest.FunSuite

class MainTest extends FunSuite {
  test("helloWorld") {
    assert(Main.helloWorld(Input.get("/hello")).awaitValueUnsafe() == Some("Hello, World!"))
  }

  test("hello") {
    assert(Main.hello(Input.get("/hello/foo")).awaitValueUnsafe() == Some("Hello, foo!"))
  }
}