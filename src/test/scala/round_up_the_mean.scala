import java.util.Scanner

object RoundUpTheMean {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    println(math.ceil((a + b) / 2.0).toInt)
  }
}
