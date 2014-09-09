package com.wubinben.trivia.scala

import org.scalatest.FunSuite

/**
 * Created by ben on 9/9/14.
 */
class GameTest extends FunSuite {
  test("the game should not be over after a player answers a question correctly") {
    val game = new Game()
    game.add("Ben")
    game.roll(3)
    assert(game.wasCorrectlyAnswered == true)
  }
}
