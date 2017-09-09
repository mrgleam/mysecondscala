object Pet extends App{
    sealed trait Pet
    case class Fish(name: String) extends Pet
    case class Dog(name: String, breed: String) extends Pet
    case class Cat(name: String, fishCaught: Int) extends Pet {
        def meet(p: Pet) = p match {
            case Fish(_) => Cat(name , fishCaught + 1)
            case Dog(_,_) => Cat(name, 0)
            case Cat(_,_) => Cat(name, fishCaught)
        }
    }

    val otherCat: Pet = Cat("Alice",0)
    val jan: Pet = Dog("Jan", "Poddle")
    val peter: Pet = Fish("Peter")
    val bob: Pet = Cat("Bob",0).meet(peter).meet(otherCat).meet(jan)

    println(bob)
}
