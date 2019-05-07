import java.util.Scanner

object AddSubMul {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    println(Array(a + b, a - b, a * b).max)
  }
}
