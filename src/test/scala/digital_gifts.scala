import java.util.Scanner

object DigitalGifts {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt


    def go(n: Int, acc: Double): Double = {
      if (n == 0) acc
      else {
        val Array(value, unit) = sc.nextLine.split(" ")
        if (unit == "JPY") go(n - 1, acc + value.toDouble)
        else go(n - 1, acc + value.toDouble * 380000.0)
      }
    }

    println(go(n, 0.0))
  }
}