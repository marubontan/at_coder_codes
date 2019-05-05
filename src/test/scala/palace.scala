import java.util.Scanner

object Palace {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    sc.nextLine()
    val Array(t, a) = sc.nextLine.split(" ").map(_.toInt)
    val candidates = sc.nextLine.split(" ").map(_.toInt)

    println(candidates.zipWithIndex.slice(1, candidates.length).foldLeft((Math.abs((t - candidates.head * 0.006) - a), 1)) {
      case ((presentMin, _), (height, index)) if Math.abs((t - height * 0.006) - a) < presentMin => (Math.abs((t - height * 0.006) - a), index + 1)
      case ((presentMin, presentIndex), _) => (presentMin, presentIndex)
    }._2)
  }

}
