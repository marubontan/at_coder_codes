import java.util.Scanner

object DayOfTakahashi {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    if (a <= b) println(a)
    else println(a - 1)

  }

}
