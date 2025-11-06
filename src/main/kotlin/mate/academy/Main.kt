package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array<Figure>(6) { index ->
        if (index < 3) figureSupplier.getRandomFigure() else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it.draw() }
}
