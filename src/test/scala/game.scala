import java.util.Scanner

object Game {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, d) = sc.nextLine.split(" ").map(_.toInt)
    println(Array((a + 1) * d, a * (d + 1)).max)
  }
}
