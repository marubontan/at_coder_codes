import java.util.Scanner

object NCircle {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextLine.toInt
    val radius = List.fill(n)(sc.nextLine.toInt).sorted
    val areas = radius.map(r => r * r * math.Pi).scanLeft((0.0, 0.0)) {
      (oneBefore, area) => (area - oneBefore._2, area)
    }.zipWithIndex
    if (n % 2 == 1) println(areas.filter(_._2 % 2 == 1).map(_._1._1).sum)
    else println(areas.filter(_._2 % 2 == 0).map(_._1._1).sum)
  }
}
