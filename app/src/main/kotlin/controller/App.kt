package controller

import model.canvas.Canvas
import view.Renderer


object App {
    fun readCommand(): List<Int> {
        val userInput: MutableList<Int> = mutableListOf()

        while (true) {
            print("enter command: ")
            val input = readLine()!!.split(" ")

            if (
                (input.first() == "C" || input.first() == "c")
                && input.size == 3
            ) {
                for (i in 1..2) userInput.add(input[i].toInt())
                break
            }
        }

        return userInput
    }

    fun createCanvas(
        width: Int,
        height: Int
    ): String {
        val canvas = Canvas(width, height)
        return Renderer.render(canvas)
    }

    fun start() {
        val (width, height) = readCommand()
        println(createCanvas(width, height))
    }


    @JvmStatic
    fun main(args: Array<String>) {
        start()
    }
}






