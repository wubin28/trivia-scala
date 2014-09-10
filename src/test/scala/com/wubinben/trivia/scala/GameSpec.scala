package com.wubinben.trivia.scala

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by ben on 9/9/14.
 */
class GameSpec extends FlatSpec with Matchers {
  "A Game" should "not be over after the first player answers a question correctly" in {
    val game = new Game()
    game.add("Ben")
    game.roll(3)
    game.wasCorrectlyAnswered should be (true)
  }
}
