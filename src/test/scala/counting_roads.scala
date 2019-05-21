import java.util.Scanner

object CountingRoads {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, m) = sc.nextLine.split(" ").map(_.toInt)
    val roads = List.fill(m)(sc.nextLine.split(" ").map(_.toInt)).flatten
    (1 to n).map{city => roads.count(_ == city)}.foreach(println)
  }
}
