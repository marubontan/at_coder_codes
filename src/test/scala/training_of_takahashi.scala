import java.util.Scanner

object TrainingOfTakahashi {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val variables = List.fill(2)(sc.nextLine)
    if (variables.head.length > variables.last.length) println(variables.head)
    else println(variables.last)
  }
}
