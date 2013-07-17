package net.kaczmarzyk.life

import Game.Generation


object Game {
  
  type Generation = Map[(Int, Int), Symbol]
  
  def apply(initialGenSpec: String) = {
    val initialGen = new GenerationParser().parseGen(initialGenSpec)
    new Game(initialGen)
  }
}

class Game(val initialGen: Map[(Int, Int), Symbol]) {

  def generation(seq: Int): Generation = {
    if (seq == 0) initialGen
    else throw new UnsupportedOperationException("not implemented yet")
  }
}