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

  def keyString(input: String, key: Int): Int = {

    val multiplier =input.length / key.toString.length
    val remainder = input.length % key.toString.length
    val endOfKey = key.toString.take(remainder).toString
    val newKey= key.toString*multiplier + endOfKey
     newKey.toInt
  }
  def splitKey(key: Int): Array[Int] = {
    key.toString.map(_.asDigit).toArray
  }
  def splitKeyToArray(input:String,key:Int):Array[Int]={
   splitKey(keyString(input,key))
  }
  def encode(input1:List[Int],input2: List [Int]):List[Int]= {
    (input1,input2).zipped.map(_ + _)
  }
  def encodeAnswer(input:String,key:Int):List[Int]= {
    (stringToInts(input),splitKeyToArray(input,key)).zipped.map(_ + _)
  }

}
