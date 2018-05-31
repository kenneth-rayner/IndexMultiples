import org.scalatest.{MustMatchers, WordSpec}

class ScrabbleSpec extends WordSpec with MustMatchers {

  "Scrabble" must {
    "Return the correct word score" when {
      "Given a valid 1 letter word" in{
        Scrabble.wordScore("a","","") mustEqual 1
      }
      "Given another valid 1 letter word" in{
        Scrabble.wordScore("i","","") mustEqual 1
      }
      "Given a valid 2 letter word" in{
        Scrabble.wordScore("at","","") mustEqual 2
      }
      "Given a valid 7 letter word" in{
        Scrabble.wordScore("quality","","") mustEqual 69
      }
      "Given a valid 7 letter word with double and triple letters" in{
        Scrabble.wordScore("quality","q","y") mustEqual 87
      }
    }

  }

}
