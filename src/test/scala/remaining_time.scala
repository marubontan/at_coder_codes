import java.util.Scanner

object RemainingTime {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    println((a + b) % 24)
  }
}
