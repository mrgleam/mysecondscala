object Shapes extends App{
    sealed abstract class Shape
    case class Circle(r: Int) extends Shape {
        def circumference = (2 * math.Pi * r)
        def area = (math.Pi*math.pow(r,2))
    }
    case class Triangle(d1: Int, d2: Int, d3: Int) extends Shape {
        val s = (d1 + d2 + d3)/2
        def circumference = (d1+d2+d3)
        def area = math.sqrt(s*(s-d1)*(s-d2)*(s-d3))
        def determine = (d1, d2, d3) match {
            case (a, b, c) if a == b && b == c => "Equilateral"
            case (a, b, c) if a == b || b == c => "Isosceles"
            case (a, b, c) if a != b && b != c => "Scalene"
        }
    }
    case class Rectangle(w: Int, h: Int) extends Shape {
        def circumference = (w*2) + (h*2)
        def area = (w*h)
    }

    val areaOfCircle = Circle(10).area
    val circumOfCircle = Circle(10).circumference
    val areaOfRectangle = Rectangle(10, 5).area
    val circumOfRectangle = Rectangle(10, 5).circumference
    val areaOfTriangle = Triangle(10,10,12).area
    val circumOfTriangle = Triangle(10,10,10).circumference
    val determineOfTriangle = Triangle(10,9,5).determine
    println(determineOfTriangle)
    //def main(args: Array[String]) = println("Hello Scala!", determineOfTriangle, areaOfCircle, circumOfCircle, areaOfRectangle, circumOfRectangle, areaOfTriangle, circumOfTriangle)
}
