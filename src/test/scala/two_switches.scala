import java.util.Scanner

object TwoSwitches {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(a, b, c, d) = sc.nextLine.split(" ").map(_.toInt)
    if (Array(b, d).min - Array(a, c).max <= 0) println(0)
    else println(Array(b, d).min - Array(a, c).max)
  }
}
