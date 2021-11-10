package controller

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AppFunctionalTest {
    @Test
    fun `can create a canvas`() {
        val actual = App.createCanvas(20, 4)

        val expected = """
            ----------------------
            |                    |
            |                    |
            |                    |
            |                    |
            ----------------------
        """.trimIndent()

        assertEquals(expected, actual, "Should render a canvas of 20 width and 4 height")
    }
}