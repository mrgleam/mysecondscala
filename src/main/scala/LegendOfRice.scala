object LegendOfRice extends App {
  val seq = 0 to 63
  val seq2 = seq map (math.pow(2,_))
  println(seq2)
  println(seq2 reduce (_ + _))
}
