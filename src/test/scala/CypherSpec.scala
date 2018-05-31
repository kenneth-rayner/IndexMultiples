import org.scalatest.{MustMatchers, WordSpec}

class CypherSpec extends WordSpec with MustMatchers {

  "Cypher" must {
    "return the correct result" when {

      "given a char returns its index in the alphabet" in {
        Cypher.convertToInt('a') mustEqual 1
      }
      "given a string return it as a list of chars" in {
        Cypher.stringToChars("Hello") mustEqual List('H', 'e', 'l', 'l', 'o')
      }
      "given a string return it a a list of Ints" in {
        Cypher.stringToInts("hello") mustEqual List(8, 5, 12, 12, 15)
      }
    }
    "return the correct length keyString" when {
      "given a key the same length as the input" in {
        Cypher.keyString("h", 1) mustEqual "1"
      }
      "given a key shorter than the input" in {
        Cypher.keyString("hi", 1) mustEqual "11"
      }
      "given a key shorter than a longer input" in {
        Cypher.keyString("masterpiece", 1939) mustEqual "19391939193"
      }
    }
    "return an List of digits" when {
      "given a string of numbers" in {
        Cypher.splitKey("Hi",2) mustEqual List('2','2')
      }
    }
    "return the keyString as an array of digits of the right length:" when {

      "given a input:String and key:Ints of the same length" in {
        Cypher.splitKeyToList("hi", 11) mustEqual List(1, 1)
      }
    }
    "given a key:Int shorter than input:String" in {
      Cypher.splitKeyToList("hello", 1234) mustEqual List(1, 2, 3, 4, 1)
    }
  }
  "return one list of Ints" when {
    "given 2 lists the same length sum them" in {
      Cypher.encode(List(1, 2, 3), List(2, 4, 6)) mustEqual List(3, 6, 9)
    }
  }
  "return the correct Cypher code" when {
    "given a string and a key return the correct secret code" in {
      Cypher.encodeAnswer("scout", 1939) mustEqual List(20, 12, 18, 30, 21)
    }
    "given a longer string and a key return the correct secret code" in {
      Cypher.encodeAnswer("masterpiece", 1939) mustEqual List(14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8)
    }
  }

}

