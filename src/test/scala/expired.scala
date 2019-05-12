import java.util.Scanner

object Expired {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(x, a, b) = sc.nextLine.split(" ").map(_.toInt)
    val point = b - a
    if (point <= 0) println("delicious")
    else if (point >= x + 1) println("dangerous")
    else println("safe")
  }
}
