import java.util.Scanner

object NarrowRectanglesEasy {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(w, a, b) = sc.nextLine.split(" ").map(_.toInt)
    val Array(aOne, aTwo, bOne, bTwo) = Array(a, a + w, b, b + w)
    if ((aOne <= bOne & bOne <= aTwo) | (aOne <= bTwo & bTwo <= aTwo)) println(0)
    else println(Array(math.abs(bOne - aOne), math.abs(bOne - aTwo), math.abs(bTwo - aOne), math.abs(bTwo - aTwo)).min)
  }
}
