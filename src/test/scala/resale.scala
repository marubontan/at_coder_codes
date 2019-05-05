import java.util.Scanner

object Resale {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    sc.nextLine()

    val values: List[Int] = sc.nextLine().split(" ").map(_.toInt).toList
    val costs: List[Int] = sc.nextLine().split(" ").map(_.toInt).toList

    println((values zip costs).map(item => item._1 - item._2).filter(profit => profit >= 0).sum)

  }
}