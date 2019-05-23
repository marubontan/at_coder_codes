import java.util.Scanner

object Swap {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    println(Array(b, a).mkString(" "))
  }
}
