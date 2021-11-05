package controller

import model.canvas.Canvas
import view.Renderer


object App {
    fun start() {
        val (command, width, height) = readLine()?.split(" ") ?: listOf()
        print(createCanvas(width, height))
    }

    fun createCanvas(
        width: String,
        height: String
    ): String {
        val canvas = Canvas(width.toInt(), height.toInt())
        return Renderer.render(canvas)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        start()
    }
}