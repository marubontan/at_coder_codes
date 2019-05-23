import java.util.Scanner

object KenshoSnack {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val a = sc.nextLine.toInt
    val b = sc.nextLine.toInt
    if (a % b == 0) println(0)
    else println(b - a % b)
  }
}
