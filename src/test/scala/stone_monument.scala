import java.util.Scanner

object StoneMonument {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)

    println((1 until (b - a)).sum - a)
  }

}
