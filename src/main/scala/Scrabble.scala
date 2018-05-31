object Scrabble {

  def wordScore(input:String,doubleLetter:String,tripleLetter:String):Int = {

    val tileScore = Map('a' ->1,'b' -> 3,'c' -> 3,'d' -> 2,'e' ->1,'f'-> 4,'g'-> 2,'h' -> 4,'i'-> 1, 'j' -> 8,'k' -> 5, 'l' -> 1,'m'-> 3, 'n' -> 1, 'o' -> 1, 'p' -> 3,'q'->10,'s'-> 1, 't' -> 1, 'u'->1, 'v' -> 4, 'w' -> 4, 'x' -> 8 , 'y' -> 4,'z' -> 10)

    val doubleLetterBonus = doubleLetter.toCharArray.map(x => tileScore(x)).sum
    val tripleLetterBonus =tripleLetter.toCharArray.map(x => 2*tileScore(x)).sum
    val score = input.toCharArray.map(x => tileScore(x)).sum + doubleLetterBonus + tripleLetterBonus

    if (input.length ==7)score +50 else score
  }

}
