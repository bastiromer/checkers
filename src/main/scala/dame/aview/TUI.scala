package dame
package aview

import model.Move
import model.Stone
import model.Field
import controller.Controller

import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
import scala.collection.immutable._
import scala.util.matching.Regex

class  TUI:

    //controller.add(this)
    val controll = Controller()
    val size = 8
    //val inputmove: Regex = "([A-Ha-h])[1-8]([A-Ha-h])[1-8]".r
    val inputmove: Regex = "[1-8]{4}".r

    //val v = Vector[(inputmove,)]
    //def main(args: Array[String]): Unit =
    //    run()

    def run() =
        val field = Field(size)
        println(field.toString())
        val input = readLine() //1122
        if(inputmove.matches(input))
            analyseInput(input)
        print("false input")


    def analyseInput(in: String): Unit = 
        val inputArray = in.toCharArray() //[1,1,2,2]
        println(controll.checkMove(inputArray))

