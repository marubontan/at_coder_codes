import java.util.Scanner

object NextMonth {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val m = sc.next.toInt
    if (m == 12) println(1)
    else println(m + 1)
  }
}
