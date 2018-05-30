import org.scalatest.{MustMatchers, WordSpec}

class NthLargestSpec extends WordSpec with MustMatchers {
  "Nth largest spec" must {
    "return the solution:" when {
      "return the highest number from a list of 2 numbers" in {
        NthLargest.findResult(List(1, 2), 1) mustEqual 2
      }
      "return the second highest number from a list of 2 numbers" in {
        NthLargest.findResult(List(1, 2), 2) mustEqual 1
      }
      "return the highest number from a list of multiple numbers" in {
        NthLargest.findResult(List(1, 5, 3, 2, 4, 6, 7, 8, 9), 1) mustEqual 9
      }
      "return the second highest number from a list of multiple numbers" in {
        NthLargest.findResult(List(1, 2, 3, 4, 5, 6, 7, 8, 9), 2) mustEqual 8
      }
      "return the nth highest number from a list of multiple numbers" in {
        NthLargest.findResult(List(1, 9, 4, 3, 5, 6, 7, 8, 2), 4) mustEqual 6
      }
      "return the nth highest distinct number from a list of 3 numbers" in {
        NthLargest.findResult(List(4, 1, 4), 1) mustEqual 4
      }
      "return the nth highest distinct number from a list of 4 numbers" in {
        NthLargest.findResult(List(1, 1, 2, 2), 2) mustEqual 1
      }
      "return the nth highest distinct number from a list of multiple numbers" in {
        NthLargest.findResult(List(1, 1, 2, 8, 9, 5, 4, 5, 6, 3, 4, 5, 6, 7, 8, 9), 4) mustEqual 6
      }
    }
    "Throw an Illegal Argument Exception" when {
      "the key is higher than the length of the input" in {
        assertThrows[IllegalArgumentException] {
          NthLargest.findResult(List(1, 2), 3)
        }
      }
    }
  }
}