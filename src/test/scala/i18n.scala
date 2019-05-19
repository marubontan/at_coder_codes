import java.util.Scanner

object IEightteenN {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val word: String = sc.next
    val ans = word.head.toString + (word.length - 2).toString + word.last.toString
    println(ans)
  }
}
