import java.util.Scanner

object Prison {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, m) = sc.nextLine.split(" ").map(_.toInt)
    val gateRanges = List.fill(m)(sc.nextLine.split(" ").map(_.toInt))
    val leftMax = gateRanges.map(_(0)).max
    val rightMin = gateRanges.map(_(1)).min
    if ((rightMin - leftMax) < 0) println(0)
    else println(rightMin - leftMax + 1)
  }
}