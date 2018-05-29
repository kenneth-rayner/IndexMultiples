import org.scalatest.{MustMatchers, WordSpec}

class IndexMultiplesSpec extends WordSpec with MustMatchers{

  "IndexMultiples" must {

    "From an input list with one number return that number" in {
      IndexMultiples.index(List(0)) mustEqual List(0)
    }
    "From a list of 2 numbers return a list containing only zero if the first number is zero and the second number is not 1" in {
      IndexMultiples.index(List(0,2)) mustEqual List(0,2)
    }
    "From a list of 2 numbers return a list where one number matche it's index" in {
      IndexMultiples.index(List(1,2)) mustEqual List(2)
    }
    "From a list of 3 numbers return a list containing only zero if the first number is not zero and the second number is 0" in {
      IndexMultiples.index(List(1,2,3)) mustEqual List(2)
    }
    "From a list of 5 numbers return a list containing numbers that are multiples of index" in {
      IndexMultiples.index(List(2,4,7,9,10)) mustEqual List(4,9)
    }
    "From a list of many numbers return a list containing numbers that are multiples of index" in {
      IndexMultiples.index(List(2,6,6,9,16)) mustEqual List(6,6,9,16)
    }
  }
}
