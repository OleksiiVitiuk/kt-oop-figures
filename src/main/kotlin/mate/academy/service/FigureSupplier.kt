package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    companion object {
        private const val FIGURE_TYPES_COUNT = 5
        private const val MIN_SIZE = 1.0
        private const val MAX_SIZE = 10.0
        private const val DEFAULT_RADIUS = 10.0
        private val DEFAULT_COLOR = Color.WHITE
    }

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            0 -> Square(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))
            1 -> Rectangle(
                color,
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
            2 -> RightTriangle(
                color,
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
            3 -> Circle(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))
            else -> IsoscelesTrapezoid(
                color,
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_COLOR, DEFAULT_RADIUS)
    }
}
