import java.util.Scanner

object TravelingAtcodeerProblem {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    sc.nextLine()
    val houses = sc.nextLine.split(" ").map(_.toInt).sorted
    println((houses.slice(1, houses.length) zip houses.slice(0, houses.length - 1)).map(item => item._1 - item._2).sum)
  }
}
