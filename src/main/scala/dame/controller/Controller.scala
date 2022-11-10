package dame.controller

import dame.model.{Field,Move,Cell,Stone}

class Controller :
    def checkMove(in: Array[Char]): String =
        val x1 = in(0).toInt
        val y1 = in(1).toInt
        val x2 = in(2).toInt
        val y2 = in(3).toInt

        if((x2 - x1) == 1 | (x2 - x1) == -1)
            if((y2 - y1) == 1 | (y2 - y1) == -1)
                doMove(x1, y1, x2, y2)
            else
                "false move"
        else
            "false move"

    def doMove(x1: Int, y1: Int, x2: Int, y2: Int): String =
        "Stone succsesfully moved"

