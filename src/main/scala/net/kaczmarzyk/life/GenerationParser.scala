package net.kaczmarzyk.life

class GenerationParser {

  def parseGen(spec: String) = {
    var gen = Map[(Int, Int), Symbol]().withDefaultValue('dead)
    val rows = split(spec)
    for {
      rowNum <- 0 until rows.size
      row = rows(rowNum)
      colNum <- 0 until row.size
      cellVal = row(colNum)
      if cellVal == 'x'
    } {
      gen += (colNum, rowNum) -> 'alive
    }
    gen
  }
  
  private def split(spec: String) = {
    val rows =
      for (row <- spec.split('\n').reverse) yield row.trim()
      
    if (rows(0).size == 0)
      throw new IllegalArgumentException
    
    for (row <- rows)
      if (row.size > rows(0).size) throw new IllegalArgumentException
      
    rows
  }
}