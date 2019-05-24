import java.util.Scanner

object Honest {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(x, y) = sc.nextLine.split(" ").map(_.toInt)
    if (x > y) println(x)
    else println(y)
  }
}
