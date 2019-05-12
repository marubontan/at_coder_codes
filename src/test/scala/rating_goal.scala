import java.util.Scanner

object RatingGoal {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val r: Int = sc.nextLine.toInt
    val g: Int = sc.nextLine.toInt
    println(2 * g - r)
  }
}
