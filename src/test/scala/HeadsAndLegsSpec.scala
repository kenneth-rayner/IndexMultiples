import org.scalatest.{MustMatchers, WordSpec}

class HeadsAndLegsSpec extends WordSpec with MustMatchers{

  "HeadsAndLegs" must {

    "return a tuple showing (0,1) given the input is exactly double the legs to heads ration" in {
      HeadsAndLegs.chickensAndCows(1,2)  mustEqual (1,0)
    }

    "return a tuple showing (0,number of chickens) given the input is exactly double the legs to heads ration" in {
      HeadsAndLegs.chickensAndCows(2,4)  mustEqual (2,0)
    }
    "return a string of 'No solution found if odd number of legs" in {
      HeadsAndLegs.chickensAndCows(1,3)  mustEqual "No possible solution"
    }
    "return a tuple showing (1,0) given the input is exactly double the legs to heads ration" in {
      HeadsAndLegs.chickensAndCows(1,4)  mustEqual (0,1)
    }
    "return a tuple showing (number of cows,0) given the input is exactly double the legs to heads ration" in {
      HeadsAndLegs.chickensAndCows(2,8)  mustEqual (0,2)
    }
  }

}
