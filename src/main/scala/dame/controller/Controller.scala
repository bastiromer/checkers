package dame
package controller

import dame.model.{Field,Move,Stone}
import util.Observable


class Controller(var field: Field) extends Observable:
    def checkMove(in: Array[Char]): String =
        val x1 = in(0).toLower.toInt
        val y1 = in(1).toInt
        val x2 = in(2).toLower.toInt
        val y2 = in(3).toInt

        if((x2 - x1) == 1 | (x2 - x1) == -1)
            if((y2 - y1) == 1 | (y2 - y1) == -1)
                doMove(x1, y1, x2, y2)
                "Stone successfully moved"
            else
                "false move"
        else
            "false move"

    def doMove(x1: Int, y1: Int, x2: Int, y2: Int): Unit =
        notifyObservers


    def errorHandler(in: Array[Char]): String =
        "incorrect move"

