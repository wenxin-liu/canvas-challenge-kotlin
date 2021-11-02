package view

import model.canvas.Canvas
import java.lang.StringBuilder

object Renderer {
    fun render(canvas: Canvas): String {
        val renderedCanvas = StringBuilder()
        renderedCanvas.appendLine("-".repeat(canvas.width+2))

        for (i in 1..canvas.height) {
                renderedCanvas.appendLine("|" + " ".repeat(canvas.width) + "|")
        }
        renderedCanvas.append("-".repeat(canvas.width+2))
        return renderedCanvas.toString()
    }
}