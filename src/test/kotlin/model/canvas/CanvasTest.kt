package model.canvas

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CanvasTest {
    @Test
    fun `can create a canvas`() {
        val result = Canvas(width = 20, height = 4)

        assertEquals(result.width, 20, "Actual model.canvas width should equal expected width")
        assertEquals(result.height, 4, "Actual model.canvas height should equal expected height")
    }
}