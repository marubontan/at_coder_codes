import java.util.Scanner

object BuyingSweets {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val x: Int = sc.nextLine.toInt
    val a: Int = sc.nextLine.toInt
    val b: Int = sc.nextLine.toInt
    println((x - a) % b)
  }
}
