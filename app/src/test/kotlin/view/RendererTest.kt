package view

import model.canvas.Canvas
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RendererTest {
    @Test
    fun `can render a canvas`() {
        val canvas = Canvas(20, 4)
        val result = Renderer.render(canvas)

        val expected = """
            ----------------------
            |                    |
            |                    |
            |                    |
            |                    |
            ----------------------
        """.trimIndent()

        assertEquals(expected, result, "Should be able to render a canvas")
    }
}