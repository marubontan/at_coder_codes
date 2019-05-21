import java.util.Scanner

object Varied {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val word = sc.next
    if (word.length == word.distinct.length) println("yes")
    else println("no")
  }
}
