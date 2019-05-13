import java.util.Scanner

object OchaAgain {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    if (b % a == 0) println(b / a)
    else println(b / a + 1)
  }
}
