package controller

import model.canvas.Canvas
import view.Renderer


object App {
    fun start(
        command: String,
        width: String,
        height: String
    ): String {
        return createCanvas(width, height)
    }

    fun createCanvas(
        width: String,
        height: String
    ): String {
        val canvas = Canvas(width.toInt(), height.toInt())
        return Renderer.render(canvas)
    }
}