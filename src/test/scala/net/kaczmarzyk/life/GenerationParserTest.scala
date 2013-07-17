package net.kaczmarzyk.life

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class GenerationParserTest extends FunSuite with ShouldMatchers {

  val parser = new GenerationParser()
  
  test("throws exception when generation spec is not rectangular") {
    intercept[IllegalArgumentException] {
      parser.parseGen("""|oox
                         |ooo
                         |oo """.stripMargin)
    }
  }
  
  test("throws exception when generation spec is empty") {
    intercept[IllegalArgumentException] {
      parser.parseGen("")
    }
  }
}