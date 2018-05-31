import org.scalatest.{MustMatchers, WordSpec}

class ExamResultsSpec extends WordSpec with MustMatchers{
  "ExamResults" must {
    "Return the correct score" when {
      "Given an empty answer string" in {
        ExamResults.checkExamScore(List(""),List("a")) mustEqual 0
      }
      "Given more than 1 empty answer strings" in {
        ExamResults.checkExamScore(List("",""),List("a","a")) mustEqual 0
      }
      "Given 1 correct answer" in {
        ExamResults.checkExamScore(List("a"),List("a")) mustEqual 4
      }
      "Given more than 1 correct answer" in {
        ExamResults.checkExamScore(List("a","a"),List("a","a")) mustEqual 8
      }
      "Given 1 correct answer and one blank answer" in {
        ExamResults.checkExamScore(List("a",""),List("a","a")) mustEqual 4
      }
      "Given 1 wrong answer " in {
        ExamResults.checkExamScore(List("a"),List("b")) mustEqual -1
      }
      "Given 1 wrong answer and 1 correct answer" in {
        ExamResults.checkExamScore(List("a","a"),List("a","b")) mustEqual 3
      }
      "Given 1 wrong answer and 1 correct answer and 1 empty answer" in {
        ExamResults.checkExamScore(List("a","a",""),List("a","b","c")) mustEqual 3
      }



    }
  }

}
