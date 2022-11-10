package dame
package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class FieldSpec extends AnyWordSpec {
  "Dame" should {
    val field1 = Field(1)
    val field2 = Field(2)
    val field3 = Field(3)

    "have a field in form of" in {
      field1.toString() should be("+---+\n|   |\n+---+")
      field2.toString() should be("+---+---+\n|   |   |\n+---+---+---+\n|   |   |\n+---+---+---+")
      field3.toString() should be(("+---+---+\n|   |   |\n")*3 + "+---+---+---+")
    }
    "have a scalable bar" in {
      field1.horizontal(2) should be("+---+---+\n")
      field1.horizontal(3) should be("+---+---+---+\n")
      field1.horizontal(4) should be("+---+---+---+---+\n")
    }

    "have scalable cells" in {
      field1.vertical(2) should be("|   |   |\n")
      field1.vertical(3) should be("|   |   |   |\n")
      field1.vertical(4) should be("|   |   |   |   |\n")
    }
  }
}