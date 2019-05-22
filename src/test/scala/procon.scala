import java.util.Scanner

object Procon {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val scores = List.fill(3)(sc.nextLine.split(" ").map(_.toInt))
    println(scores.map(item => item(0) * (item(1) / 10.0)).sum.toInt)
  }
}
