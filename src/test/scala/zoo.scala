import java.util.Scanner

object Zoo {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c, k) = sc.nextLine.split(" ").map(_.toInt)
    val Array(s, t) = sc.nextLine.split(" ").map(_.toInt)
    if (s + t >= k) println(a * s + b * t - (s + t) * c)
    else println(a * s + b * t)
  }
}
