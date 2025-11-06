package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

class Main {
    companion object {
        const val TOTAL_FIGURES = 6
        const val RANDOM_FIGURES_COUNT = 3
    }
}

fun main() {
    val figureSupplier = FigureSupplier()

    val figures = Array<Figure>(Main.TOTAL_FIGURES) { index ->
        if (index < Main.RANDOM_FIGURES_COUNT) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach { it.draw() }
}
