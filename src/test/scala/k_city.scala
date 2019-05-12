import java.util.Scanner

object KCity {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, m) = sc.nextLine.split(" ").map(_.toInt)
    println((n - 1) * (m - 1))
  }
}
