import java.util.Scanner

object RrrrB {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, x) = sc.nextLine.split(" ").map(_.toInt)
    println(Array(x - 1, n - x).min)
  }
}
