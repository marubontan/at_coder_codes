import java.util.Scanner

object Polygon{
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    sc.nextLine

    val sortedSides: Array[Int] = sc.nextLine.split(" ").map(_.toInt).sorted
    val maxSide: Int = sortedSides(sortedSides.length - 1)
    if (maxSide < sortedSides.slice(0, sortedSides.length - 1).sum) println("Yes")
    else println("No")
  }
}