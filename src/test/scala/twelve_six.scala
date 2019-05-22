import java.util.Scanner

object TwelveSix {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(m, d) = sc.nextLine.split(" ").map(_.toInt)
    if (m % d == 0) println("YES")
    else println("NO")
  }
}
