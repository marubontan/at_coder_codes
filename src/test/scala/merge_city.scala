import java.util.Scanner

object MergeCity {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextLine.toInt
    val cities = List.fill(n)(sc.nextLine.split(" "))
    val maxPeopleCity = cities.maxBy(_.last.toInt)
    if (cities.map(_.last.toInt).sum / 2 < maxPeopleCity.last.toInt) println(maxPeopleCity.head)
    else println("atcoder")
  }
}
