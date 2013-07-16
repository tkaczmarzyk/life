package net.kaczmarzyk.life

import Game.Generation


object Game {
  
  type Generation = Map[(Int, Int), Symbol]
  
  def apply(initialGenSpec: String) = {
    val initialGen = parseGen(initialGenSpec)
    new Game(initialGen)
  }
  
  private def parseGen(spec: String) = {
    var gen = Map[(Int, Int), Symbol]().withDefaultValue('dead)
    val rows = spec.split('\n').reverse
    for {
      rowNum <- 0 until rows.size
      row = rows(rowNum).trim()
      colNum <- 0 until row.size
      cellVal = row(colNum)
      if cellVal == 'x'
    } {
      gen += (colNum, rowNum) -> 'alive
    }
    gen
  }
}

class Game(val initialGen: Map[(Int, Int), Symbol]) {

  def generation(seq: Int): Generation = {
    if (seq == 0) initialGen
    else throw new UnsupportedOperationException("not implemented yet")
  }
}