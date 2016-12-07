object Reduce extends App {
	val a = Array(12, 6, 15, 2, 20, 9)
	println(a.mkString(" "))
	
	println(s"Sum: ${a.reduceLeft(_ + _)}")

	println(s"Sum: ${a.reduceLeft((x,y) => x + y)}")

	println(s"Product: ${a.reduceLeft(_ * _)}")

	println(s"Min: ${a.reduceLeft(_ min _)}")

	println(s"Max: ${a.reduceLeft(_ max _)}")

}