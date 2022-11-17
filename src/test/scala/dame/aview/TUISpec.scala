//package dame
//package aview

/*import model.Move
import model.Stone
import model.Field
import controller.Controller

import java.io.ByteArrayInputStream
import scala.io.StdIn
import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec


//class TUISpec extends AnyWordSpec :
  
    "The TUI" should {
        val tui = TUI(Controller(Field(8)))
        val tui2 = TUI(Controller(Field(1)))
        "print the field" in {
            tui2.update should be("+---+\n" +
                                  "|   |\n" +
                                  "+---+\n")
        }
        "call the method getInput" in {
            val in = new ByteArrayInputStream(("a1b2").getBytes)
            Console.withIn(in)  {
                assert(StdIn.readLine() === "a1b2")
            }
            tui.getInput() should be("incorrect move")
        }

        "recognize the input A1B2 as a move from (A 1) to (B 2)" in {
            tui.processInput("A1B2") should be("Stone successfully moved")
        }

        "recognize the input A1B3 as a false move" in {
            tui.processInput("a1b3") should be("false move")
        }

        "recognize the input A1H2 as a false move" in {
            tui.processInput("a1h2") should be("false move")
        }

        "recognize the input c3k9 as a false input" in {
            tui.processInput("c3k9") should be("incorrect move")
        }

    }
*/