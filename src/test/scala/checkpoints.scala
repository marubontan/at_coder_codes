import java.util.Scanner

object Checkpoints {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, m) = sc.nextLine.split(" ").map(_.toInt)
    val nPoints = List.fill(n)(sc.nextLine.split(" ").map(_.toInt))
    val mPoints = List.fill(m)(sc.nextLine.split(" ").map(_.toInt))
    nPoints.map {
      nPoint => mPoints.map { mPoint => math.abs(mPoint(0) - nPoint(0)) + math.abs(mPoint(1) - nPoint(1)) }.zipWithIndex.minBy(item => item._1)._2 + 1
    }.foreach(println)
  }
}
