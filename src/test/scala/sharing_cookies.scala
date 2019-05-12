import java.util.Scanner

object SharingCookies {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    if (a % 3 == 0 | b % 3 == 0 | (a + b) % 3 == 0) println("Possible")
    else println("Impossible")
  }
}
