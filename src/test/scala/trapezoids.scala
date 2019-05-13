import java.util.Scanner

object Trapezoids {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val a: Int = sc.nextLine.toInt
    val b: Int = sc.nextLine.toInt
    val h: Int = sc.nextLine.toInt
    println((a + b) * h / 2)
  }
}
