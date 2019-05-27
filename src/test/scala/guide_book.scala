import java.util.Scanner

object GuideBook {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextLine.toInt
    val restaurants = List.fill(n)(sc.nextLine.split(" "))
    restaurants.zipWithIndex.sortBy(item => (item._1(0), -item._1(1).toInt)).map(_._2).map(_ + 1).foreach(println)
  }
}
