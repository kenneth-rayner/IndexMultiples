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
        Cypher.keyString("h", 1) mustEqual 1
      }
      "given a key shorter than the input" in {
        Cypher.keyString("hi", 1) mustEqual 11
      }
      "given a string of numbers return an array of digits" in {
        Cypher.splitKey(12345) mustEqual Array(1, 2, 3, 4, 5)
      }
    }
    "return the keyString as an array " when {
      "given a key of numbers return an array of digits" in {
        Cypher.splitKeyToArray("hi", 11) mustEqual Array(1, 1)
      }

      "given a key of  numbers return shorter than the array" in {
        Cypher.splitKeyToArray("hello", 1234) mustEqual Array(1, 2, 3, 4, 1)
      }
    }
    "return one list of Ints" when {
      "given 2 lists the same length" in {
        Cypher.encode(List(1, 2, 3), List(2, 4, 6)) mustEqual List(3, 6, 9)
      }
      "given a string and a key return the correct secret code" in {
        Cypher.encodeAnswer("scout", 1939) mustEqual List(20, 12, 18, 30, 21)
      }
      "given a longer string and a key return the correct secret code" in {
        Cypher.encodeAnswer("masterpiece", 1939) mustEqual List(14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8)
      }
    }
  }
}

