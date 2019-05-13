import java.util.Scanner

object TakahashiChokutai {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ").map(_.toInt)
    println(2 * (a * b + b * c + a * c))
  }
}
