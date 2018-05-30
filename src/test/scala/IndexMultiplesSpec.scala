import org.scalatest.{MustMatchers, WordSpec}

class IndexMultiplesSpec extends WordSpec with MustMatchers {

  "IndexMultiples" must {
    "return the correct elements" when {

      "the input is a lost of 0" in {
        IndexMultiples.index(List(0)) mustEqual List(0)
      }
      "From a list of 2 when th first is 0" in {
        IndexMultiples.index(List(0, 2)) mustEqual List(0, 2)
      }
      "From a list of 2 numbers it's index" in {
        IndexMultiples.index(List(1, 2)) mustEqual List(2)
      }
      "From a list of 3 numbers" in {
        IndexMultiples.index(List(1, 2, 3)) mustEqual List(2)
      }
      "From a list of 5 numbers where 2 match the index" in {
        IndexMultiples.index(List(2, 4, 7, 9, 10)) mustEqual List(4, 9)
      }
      "From a list of many numbers" in {
        IndexMultiples.index(List(2, 6, 6, 9, 16)) mustEqual List(6, 6, 9, 16)
      }
    }
  }
}