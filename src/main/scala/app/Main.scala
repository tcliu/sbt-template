package app

import org.slf4j.LoggerFactory

/**
  * Created by Liu on 8/27/2016.
  */
object Main {

  lazy val logger = LoggerFactory.getLogger(Main.getClass)

  def main(args: Array[String]): Unit = {
    logger.info("Hello world!")
  }
}
