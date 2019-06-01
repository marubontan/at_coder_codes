import java.util.Scanner

object Id {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, m) = sc.nextLine.split(" ").map(_.toInt)
    val prefecturesAndCities = List.fill(m)(sc.nextLine.split(" ").map(_.toInt))
    val prefecturesAndCitiesScoreMap = prefecturesAndCities.groupBy(
      _.head
    ).mapValues(
      _.map(_.last).sorted.zipWithIndex.toMap
    )
    prefecturesAndCities.map(
      item => (item.head, prefecturesAndCitiesScoreMap(item.head)(item.last) + 1)
    ).map(
      item => "%06d".format(item._1) + "%06d".format(item._2)
    ).foreach(println)
  }
}
