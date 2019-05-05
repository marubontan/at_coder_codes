import java.util.Scanner

object FavoriteSound {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ").map(_.toInt)

    val maxNumber: Int = b / a
    if (maxNumber > c) {
      println(c)
    } else {
      println(maxNumber)
    }
  }
}