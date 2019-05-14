import java.util.Scanner

object RatioOfWin {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c, d) = sc.nextLine.split(" ").map(_.toFloat)
    if (b/a > d/c) println("TAKAHASHI")
    else if (b/a < d/c) println("AOKI")
    else println("DRAW")
  }
}
