package net.kaczmarzyk.life

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class GameTest extends FunSuite with ShouldMatchers {

  test("game initializes the first generation") {
    val game = Game("""
    	ooo
        oxx
        ooo""")
        
    val gen = game.generation(0);
    
    gen(0, 0) should be === 'dead
    gen(1, 0) should be === 'dead
    gen(1, 1) should be === 'alive
    gen(2, 1) should be === 'alive
  }
}