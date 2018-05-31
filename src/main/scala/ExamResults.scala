object ExamResults {

  def checkExamScore(input: List[String], answers: List[String]): Int = {

    val inputAndAnswers = input.zip(answers)
    val examScores = inputAndAnswers.map(x =>
     if (x._1 == "") 0
      else if (x._1 ==  x._2)4
        else -1)
    examScores.sum
  }
}

