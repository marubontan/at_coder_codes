import java.util.Scanner

object Restaurant {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    println(n * 800 - 200 * (n / 15))
  }
}
