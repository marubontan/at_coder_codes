import java.util.Scanner

object MealDelivery {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(x, a, b) = sc.nextLine.split(" ").map(_.toInt)
    if (math.abs(x - a) < math.abs(x - b)) println("A")
    else println("B")
  }
}
