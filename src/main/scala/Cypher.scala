object Cypher {

  def convertToInt(input: Char): Int = {
    val convertChar = ('a' to 'z').zip(1 to 26).toMap
    convertChar(input)
  }

  def stringToChars(input: String): List[Char] = {
    input.toList
  }

  def stringToInts(input: String): List[Int] = {
    input.toList.map(x => convertToInt(x))
  }

  def keyString(input: String, key: Int): String = {
    val multiplier = input.length / key.toString.length
    val remainder = input.length % key.toString.length
    val endOfKey = key.toString.take(remainder).toString
    val newKey = key.toString * multiplier + endOfKey
    newKey
  }

  def splitKey(input: String, key: Int): List[Char] = {
    keyString(input, key).toList
  }

  def splitKeyToList(input: String, key: Int): List[Int] = {
    splitKey(input, key).map(x => x.toString.toInt)
  }

  def encode(input1: List[Int], input2: List[Int]): List[Int] = {
    (input1, input2).zipped.map(_ + _)
  }

  def encodeAnswer(input: String, key: Int): List[Int] = {
    (stringToInts(input), splitKeyToList(input, key)).zipped.map(_ + _)
  }
}
