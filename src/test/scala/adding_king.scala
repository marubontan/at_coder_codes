import java.util.Scanner

object AddingKing {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(i, j) = sc.nextLine.split("").map(_.toInt)
    println(i + j)
  }
}
