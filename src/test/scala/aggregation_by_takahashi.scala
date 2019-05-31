import java.util.Scanner

object AggregationByTakahashi {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    sc.nextLine()
    val bugs = sc.nextLine.split(" ").map(_.toInt).filter(_ != 0)
    println(math.ceil(bugs.sum / bugs.length.toDouble).toInt)
  }
}
