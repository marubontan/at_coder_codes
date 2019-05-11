import java.util.Scanner

object SmallAndLargeIntegers {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, k) = sc.nextLine.split(" ").map(_.toInt)
    (a to b).foreach(i => if (i < a + k || i > b - k) println(i))
  }
}
