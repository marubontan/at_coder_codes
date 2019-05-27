import java.util.Scanner

object HalfAndHalf {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(a, b, c, x, y) = sc.nextLine.split(" ").map(_.toInt)
    if (x < y) println(Array(a * x + b * y, 2 * c * x + b * (y - x), 2 * c * y).min)
    else println(Array(a * x + b * y, 2 * c * y + a * (x - y), 2 * c * x).min)
  }
}
