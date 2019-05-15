import java.util.Scanner

object BestBody {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, s, t) = sc.nextLine.split(" ").map(_.toInt)
    val weights = List.fill(n)(sc.nextInt).scanLeft(0)((a, b) => a + b)
    println(weights.count(w => (s <= w) & (w <= t)))
  }
}
