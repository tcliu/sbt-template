package app

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Liu on 8/27/2016.
  */
class MainSpec extends FlatSpec with Matchers {

  "main" should "output Hello World" in {
    Main.main(Array())
  }

}
