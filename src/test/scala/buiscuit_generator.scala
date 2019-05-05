import java.util.Scanner

object BuiscuitGenerator {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)

    val List(a, b, t): List[Int] = sc.nextLine().split(" ").map(_.toInt).toList
    val realTime: Double = t + 0.5

    println((realTime / a).toInt * b)

  }
}