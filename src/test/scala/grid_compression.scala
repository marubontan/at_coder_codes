import java.util.Scanner

object GridCompression {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(h, w) = sc.nextLine.split(" ").map(_.toInt)
    val table = List.fill(h)(sc.nextLine.toList).map(_.toList)
    table.filter(_.contains('#')).transpose.filter(_.contains('#')).transpose.map(_.mkString).foreach(println(_))
  }

}
