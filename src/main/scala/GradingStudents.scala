object GradingStudents extends App {

def grade(x: Int) = x match {
  case x if x>=91 && x<=100 => "A"
  case x if x>=81 && x<=90 => "B"
  case x if x>=71 && x<=80 => "C"
  case x if x>=56 && x<=70 => "D"
  case _ => "F"
}

def sampleMap = sampleSeq.toMap
val sampleSeq = collection.immutable.Seq(
    ("alison",84),
    ("anita",74),
    ("billy",95),
    ("bob",82),
    ("brad",86),
    ("carolyn",87),
    ("charlotte",91),
    ("claude",77),
    ("clint",81),
    ("constance",89),
    ("daryl",90),
    ("david",89),
    ("essie",80),
    ("faye",83),
    ("henrietta",73),
    ("jennie",72),
    ("joshua",96),
    ("june",94),
    ("justin",64),
    ("katie",71),
    ("kelley",74),
    ("latoya",70),
    ("leroy",88),
    ("loretta",81),
    ("lowell",56),
    ("marguerite",85),
    ("martin",75),
    ("mary",90),
    ("maurice",73),
    ("melody",87),
    ("mercedes",20),
    ("naomi",94),
    ("nick",98),
    ("nicolas",72),
    ("norma",87),
    ("patricia",88),
    ("percy",79),
    ("randy",84),
    ("rosalie",58),
    ("ruben",90),
    ("shelly",45),
    ("sherman",100),
    ("silvia",87),
    ("simon",89),
    ("sophie",79),
    ("thelma",75),
    ("timothy",99),
    ("wilbert",69),
    ("william",68),
    ("woodrow",83)
  )
  println(sampleMap mapValues(grade))

  println(sampleMap mapValues(grade) groupBy(_._2) mapValues(_.keySet))

  println(sampleMap mapValues(grade) groupBy(_._2) mapValues(_.size))

  //println(sampleSeq.sortBy(_._2).reverse)

  println(sampleSeq.sortBy(_._2).reverse.indexWhere(_._1=="simon") + 1)
}
