object HeadsAndLegs {

  def chickensAndCows(heads: Int, legs: Int): Any = {

    if (legs % 2 == 0) {
      val numCows = (legs - (2 * heads)) / 2
      val numChickens = heads - numCows

      if ((numChickens >= 0) && (numCows >= 0)) {
        (numChickens,numCows)
      }
      else
        "No solution found"
    }
    else "No solution found"
  }
}