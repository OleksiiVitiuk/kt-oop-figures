package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()

    val totalFigures = 6
    val halfRandom = 3

    val figures = Array<Figure>(totalFigures) { index ->
        if (index < halfRandom) figureSupplier.getRandomFigure() else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it.draw() }
}
