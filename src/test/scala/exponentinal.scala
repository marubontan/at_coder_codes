import java.util.Scanner

object Exponentinal {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val x = sc.nextLine.toInt
    println((1 to math.sqrt(x).toInt).map(i => (1 to 10).map(k => math.pow(i, k)).filter(_ <= x).max).max.toInt)
  }
}
