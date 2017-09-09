object FizzBuzz extends App {
  def func(x: Int) = x match {
    case x if x%3 == 0 && x%5 == 0 => "fizzbuzz"
    case x if x%3 == 0 => "fizz"
    case x if x%5 == 0 => "buzz"
    case _ => x
  }

  def func2(x: Int) = {
    println((1 to x) map (func(_)))
  }

  println(func2(15))
}
