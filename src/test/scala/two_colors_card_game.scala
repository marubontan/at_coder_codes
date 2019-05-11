import java.util.Scanner

object TwoColorsCardGame {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    val s: List[String] = List.fill(n)(sc.nextLine)
    val m: Int = sc.nextLine.toInt
    val t: List[String] = List.fill(m)(sc.nextLine)
    val blueCount = s.groupBy(identity).mapValues(_.size).withDefaultValue(0)
    val redCount = t.groupBy(identity).mapValues(_.size).withDefaultValue(0)

    println(Array(0, (s ++ t).distinct.map(
      i => blueCount(i) - redCount(i)
    ).max).max)
  }

}
