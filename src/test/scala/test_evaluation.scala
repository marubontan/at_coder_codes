import java.util.Scanner

object TestEvaluation {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val point: Int = sc.nextInt
    if (point <= 59) println("Bad")
    else if (60 <= point & point <=89) println("Good")
    else if (90 <= point & point <= 99) println("Great")
    else println("Perfect")
  }
}
