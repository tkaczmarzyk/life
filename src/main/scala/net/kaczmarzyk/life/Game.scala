package net.kaczmarzyk.life


object Game {
  
  def apply(initialGenSpec: String) = {
    val initialGen = new GenerationParser().parseGen(initialGenSpec)
    new Game(initialGen)
  }
}

class Game(val initialGen: Generation) {

  def generation(seq: Int): Generation = {
    if (seq == 0) initialGen
    else throw new UnsupportedOperationException("not implemented yet")
  }
}