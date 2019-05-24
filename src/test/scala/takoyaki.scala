import java.util.Scanner

object Takoyaki {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(x, y) = sc.nextLine.split(" ").map(_.toInt)
    println(y / x)
  }
}
