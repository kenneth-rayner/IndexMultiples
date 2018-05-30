import org.scalatest.{MustMatchers, WordSpec}

class HeadsAndLegsSpec extends WordSpec with MustMatchers {

  "HeadsAndLegs:" must {
    "Return a string for 'no solution:" when {

      "given an input with an odd number of legs" in {
        HeadsAndLegs.chickensAndCows(1, 3) mustEqual "No solution found"
      }
      "the number of legs is more than 4 times the heads" in {
        HeadsAndLegs.chickensAndCows(12, 54) mustEqual "No solution found"

      }
      "there are less heads than quarter the number of legs" in {
        HeadsAndLegs.chickensAndCows(1, 6) mustEqual "No solution found"
      }
    }
    "Return the solution:" when {
      "the input is exactly double the legs to heads ratio" in {
        HeadsAndLegs.chickensAndCows(2, 4) mustEqual(2, 0)
      }
      "the input is exactly 4 times the legs to heads ratio" in {
        HeadsAndLegs.chickensAndCows(1, 4) mustEqual(0, 1)
      }
      "given the input is exactly double the legs to heads ration" in {
        HeadsAndLegs.chickensAndCows(2, 8) mustEqual(0, 2)
      }
      "given the input is exactly 6 legs and 2 heads" in {
        HeadsAndLegs.chickensAndCows(2, 6) mustEqual(1, 1)
      }
      "given a higher input that includes a few cows and a few chickens" in {
        HeadsAndLegs.chickensAndCows(12, 36) mustEqual(6, 6)
      }
      "return a solution for many cows and chickens" in {
        HeadsAndLegs.chickensAndCows(20, 64) mustEqual(8, 12)
      }
      "return a solution for several cows and chickens" in {
        HeadsAndLegs.chickensAndCows(3, 10) mustEqual(1, 2)
      }
    }
  }
}