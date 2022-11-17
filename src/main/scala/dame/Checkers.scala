package dame

import model.Field
import model.Stone
import aview.TUI
import controller.Controller

@main def run: Unit =
  println("Welcome to Checkers")
  val field = new Field(8, Stone.Empty)
  val controller = Controller(field)
  val tui = TUI(controller)
  tui.run()

