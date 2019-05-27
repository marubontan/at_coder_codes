import java.util.Scanner

object BumbleBee {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextLine.toInt
    val flowers = List.fill(n)(sc.nextLine.toInt)

    println(flowers.length - flowers.distinct.length)
  }
}
