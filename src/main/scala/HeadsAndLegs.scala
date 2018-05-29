object HeadsAndLegs {

  def chickensAndCows(heads: Int, legs: Int): Any = {

    legs match {
      case x if x % 2 == 1 => "No possible solution"
      case x if x / heads == 2 => (heads, 0)
      case x if x / heads == 4 => (0, heads)


        }
    }
  
}