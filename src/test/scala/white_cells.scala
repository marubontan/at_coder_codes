import java.util.Scanner

object WhiteCells{
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)

    val Array(totalH, totalW) = sc.nextLine.split(" ").map(_.toInt)
    val Array(h, w) = sc.nextLine.split(" ").map(_.toInt)
    val totalTiles: Int = totalH * totalW
    println(totalTiles - (h * totalW + w * totalH - h * w))
  }
}