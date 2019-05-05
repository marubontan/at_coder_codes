import java.util.Scanner

object DiscountFare {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(x, y) = sc.nextLine.split(" ").map(_.toInt)
    println(x + y/2)
  }
}
