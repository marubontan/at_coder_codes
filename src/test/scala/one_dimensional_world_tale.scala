import java.util.Scanner

object OneDimensionalWorldTale {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(_, _, x, y) = sc.nextLine().split(" ").map(_.toInt)
    val xMax = sc.nextLine.split(" ").map(_.toInt).max
    val yMin = sc.nextLine.split(" ").map(_.toInt).min

    if (xMax >= y) println("War")
    else if (yMin <= x) println("War")
    else {
      if (xMax >= yMin) println("War")
      else println("No War")
    }
  }

}
