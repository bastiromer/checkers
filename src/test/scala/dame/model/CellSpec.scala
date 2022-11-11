package dame
package model

import model.Stone
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class CellSpec extends AnyWordSpec:
    "Cell" should {
        val cell = Cell(Stone.B, 1, 1)
        
        "have a toString in form of" in{
            cell.toString() should be(" "+Stone.B+" ")
        }
    }
      

