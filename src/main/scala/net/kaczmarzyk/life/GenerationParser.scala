package net.kaczmarzyk.life

class GenerationParser {

  def parseGen(spec: String) = {
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