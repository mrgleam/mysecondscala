object HelloOptionalInt extends App {
    sealed trait OptionInt {
        def map (fn: Int => Int): OptionInt
    }
    case object None extends OptionInt {
        def map (fn: Int => Int) = None
    }
    case class Some(value: Int) extends OptionInt {
        def map (fn: Int => Int) = Some(fn(value))
    }
    val oi1: OptionInt = Some(20)
    oi1.map(_+10).map(_*2)
    val oi2: OptionInt = None
    oi2.map(_+10).map(_*2)
    println(oi1)
    println(oi2)
}
