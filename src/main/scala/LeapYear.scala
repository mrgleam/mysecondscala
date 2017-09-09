object LeapYear extends App {
  def leftYear(x: Int) = x match {
    case x if x%400 == 0 => true
    case x if x%100 == 0 => false
    case x if x%4 == 0 => true
    case _ => false
  }
  
  println(leftYear(2000))
  println(leftYear(2004))
  println(leftYear(2100))
  println(leftYear(2104))
  println(leftYear(2200))
  println(leftYear(2300))
  println(leftYear(2400))
}
