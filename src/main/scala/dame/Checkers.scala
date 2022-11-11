package dame

import model.Field
import aview.TUI
import controller.Controller

@main def run: Unit =
  println("Welcome to Checkers")
  val field = Field(8)
  val controller = Controller(field)
  val tui = TUI(controller)
  tui.run()

