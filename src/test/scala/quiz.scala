import java.util.Scanner

object Quiz {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val q = sc.next.toInt
    if (q == 1) println("ABC")
    else println("chokudai")
  }
}
