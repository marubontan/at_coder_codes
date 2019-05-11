import java.util.Scanner

object InfiniteCoins {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    val a: Int = sc.nextLine.toInt

    if (n % 500 > a) println("No")
    else println("Yes")
  }

}
