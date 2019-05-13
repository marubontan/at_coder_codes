import java.util.Scanner

object TakAndHotels {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    val k: Int = sc.nextLine.toInt
    val x: Int = sc.nextLine.toInt
    val y: Int = sc.nextLine.toInt

    if (n <= k) println(n * x)
    else println(k * x + y *(n - k))
  }
}
