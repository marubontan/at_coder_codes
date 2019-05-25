import java.util.Scanner

object FerrisWheel {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    if (a >= 13) println(b)
    else if (a <= 5) println(0)
    else println(b / 2)
  }
}
