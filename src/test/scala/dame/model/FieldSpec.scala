package dame
package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class FieldSpec extends AnyWordSpec {
  "Dame" should {
    val field1 = Field(1)
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