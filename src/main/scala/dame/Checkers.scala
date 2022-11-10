package dame

import aview.TUI
import controller.Controller

@main def run: Unit =
  println("Welcome to Checkers")
  val controller = Controller()
  val tui = TUI()
  tui.run()

