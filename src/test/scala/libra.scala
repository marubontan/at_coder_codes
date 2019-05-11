import java.util.Scanner

object Libra {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c, d) = sc.nextLine.split(" ").map(_.toInt)
    val left = a + b
    val right = c + d
    if (left == right) println("Balanced")
    else if (left > right) println("Left")
    else println("Right")
  }
}
