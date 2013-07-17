package net.kaczmarzyk.life

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class GenerationParserTest extends FunSuite with ShouldMatchers {

  test("throws exception when generation spec is not rectangular") {
    val parser = new GenerationParser()
    
    intercept[IllegalArgumentException] {
      parser.parseGen("""|oox
                         |ooo
                         |oo """.stripMargin)
    }
  }
}