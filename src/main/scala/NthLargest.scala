object NthLargest {

  def findResult(input: List[Int], key: Int): Any = {

    key match {
      case x if x <= input.length => input.distinct.sorted.reverse(key - 1)
      case _ => throw new IllegalArgumentException
    }
  }
}