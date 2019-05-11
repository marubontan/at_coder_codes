import java.util.Scanner

object Parking {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, a, b) = sc.nextLine.split(" ").map(_.toInt)
    println(Array(n * a, b).min)
  }
}
