import java.util.Scanner

object PaintingBallsWithAtcodeer {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, k) = sc.nextLine.split(" ").map(_.toInt)
    if (n == 1) println(k)
    else println((2 to n).foldLeft(k) {
      (acc, _) => acc * (k - 1)
    })
  }
}
