import java.util.Scanner

object TwoCoins {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ").map(_.toInt)
    if (a + b >= c) println("Yes")
    else println("No")
  }

}
