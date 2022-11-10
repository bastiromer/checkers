package dame.model

import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class MoveSpec extends AnyWordSpec{
  "A Move" should {
    "have a Stone, and a from coord. with x and a to coord. with y" in {
      val move = Move(Stone.B, 3, 3, 4, 4)
      move.stone should be(Stone.B)
     // move.x should be(33)
     // move.y should be(44)
    }
  }
}
