import java.util.Scanner

object TravelingBudget {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val List(a, b, c, d) = List.fill(4)(sc.nextInt)
    println(Array(a, b).min + Array(c, d).min)
  }
}
