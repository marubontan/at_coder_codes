import java.util.Scanner

object Manju {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ").map(_.toInt)
    println(c / Array(a, b).min)
  }
}
