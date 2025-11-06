package mate.academy.model

import kotlin.math.pow

abstract class Figure(
    val color: Color
) {
    abstract fun getArea(): Double
    abstract fun draw()
}

class Square(
    color: Color,
    private val side: Double
) : Figure(color) {

    override fun getArea(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }
}

class Rectangle(
    color: Color,
    private val width: Double,
    private val height: Double
) : Figure(color) {

    override fun getArea(): Double = width * height

    override fun draw() {
        println("Figure: rectangle, area: ${getArea()} sq. units, "
                + "width: $width units, height: $height units, color: $color")
    }
}

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {

    override fun getArea(): Double = 0.5 * firstLeg * secondLeg

    override fun draw() {
        println("Figure: right triangle, area: ${getArea()} sq. units, "
                + "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }
}

class Circle(
    color: Color,
    private val radius: Double
) : Figure(color) {

    override fun getArea(): Double = Math.PI * radius.pow(2)

    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }
}

class IsoscelesTrapezoid(
    color: Color,
    private val base1: Double,
    private val base2: Double,
    private val height: Double
) : Figure(color) {

    override fun getArea(): Double = 0.5 * (base1 + base2) * height

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${getArea()} sq. units, "
                + "base1: $base1 units, base2: $base2 units, height: $height units, color: $color")
    }
}
