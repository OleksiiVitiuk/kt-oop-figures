package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (Random.nextInt(5)) {
            0 -> Square(color, Random.nextDouble(1.0, 10.0))
            1 -> Rectangle(color, Random.nextDouble(1.0, 10.0), Random.nextDouble(1.0, 10.0))
            2 -> RightTriangle(color, Random.nextDouble(1.0, 10.0), Random.nextDouble(1.0, 10.0))
            3 -> Circle(color, Random.nextDouble(1.0, 10.0))
            else -> IsoscelesTrapezoid(color, Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0), Random.nextDouble(1.0, 10.0))
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, 10.0)
    }
}
