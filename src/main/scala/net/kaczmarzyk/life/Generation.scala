package net.kaczmarzyk.life

import scala.collection.immutable.HashMap


object Generation {
  def apply(): Generation = {
    new Generation(Map[(Int, Int), Symbol]().withDefaultValue('dead))
  }
}

class Generation(val space: Map[(Int, Int), Symbol]) {

  def apply(address: (Int, Int)): Symbol = {
    space(address)
  }
  
  def +(entry: ((Int, Int), Symbol)): Generation = {
    new Generation(space + entry)
  }
}