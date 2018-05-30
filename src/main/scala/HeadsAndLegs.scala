object HeadsAndLegs {

  def chickensAndCows(heads: Int, legs: Int): Any = {
    val numCows = (legs - (2 * heads)) / 2
    val numChickens = heads-numCows
    legs match {
        case x if (x % 2 == 0) && (numChickens >= 0) && (numCows >= 0) =>(numChickens,numCows)
        case _ =>"No solution found"
    }
  }
}