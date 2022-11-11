package dame
package aview

import model.Move
import model.Stone
import model.Field
import controller.Controller

import util.Observer

import scala.io.StdIn.readLine
import scala.collection.immutable._
import scala.util.matching.Regex

class  TUI(controller: Controller) extends Observer:

    val moveinput: Regex = "[A-Ha-h][1-8][A-Ha-h][1-8]".r
    val errorRegex: Regex = ".*".r


    def run() =
        println(controller.field.toString)
        gameLoop()

    override def update = println(controller.field.toString)


    def gameLoop(): Unit =
        readLine match
            case "exit"     => println("Goodbye")
                                System.exit(0)
            case "move"     => println(getInput())
            case _          => println("false input")
        gameLoop()


    def getInput(): String =
        println("please enter your move")
        val input = readLine()
        processInput(input)
        
    
    def processInput(in: String): String = 

        val e = controller.errorHandler(_)
        val m = controller.checkMove(_)

        val v: Vector[(Regex,(Array[Char] => String))] = Vector((errorRegex,e),(moveinput,m))

        val x = v.filter(k => in.matches(k._1.toString())).last
        val y = x._2

        y(in.toCharArray())
