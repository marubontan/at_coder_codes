import java.util.Scanner

object Restricted {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    if (a + b >= 10) println("error")
    else println(a + b)
  }
}
