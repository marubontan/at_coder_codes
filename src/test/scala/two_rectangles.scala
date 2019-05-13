import java.util.Scanner

object TwoRectangles {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c, d) = sc.nextLine.split(" ").map(_.toInt)
    val areaFirst = a * b
    val areaSecond = c * d
    if (areaFirst > areaSecond) println(areaFirst)
    else println(areaSecond)
  }
}
