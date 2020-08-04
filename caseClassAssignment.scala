import scala.math.sqrt

object caseClassAssignment extends App {
	val p1 = Point(7, 8)
	val p2 = Point(3, 2)	
	
	println("p1 is " + p1)
	println("p2 is " + p2)

	val p3= p1+p2
	println("\nSum of p1 and p2 = " + p3)

	val p4 = p1.move(2,5);
	println("\np1 moved 2 units of x and 5 units of y =" + p4)

	val dist = p2.distance(p1);
	println("\nDistance of p1 and p2 = " + dist)

	val p5 = p1.invert()
	println("\nInvert of p1 = " + p5)
}

case class Point(x:Int, y:Int) {
	
	def +(p:Point) = Point(this.x+p.x , this.y+p.y)

	def move (dx:Int, dy:Int) = Point (dx+this.x, dy+this.y)

	def distance (that: Point):Double = { sqrt((this.x-that.x)*(this.x-that.x) + (this.y-that.y)*(this.y-that.y)) } 

	def invert () = Point(this.y , this.x)
}