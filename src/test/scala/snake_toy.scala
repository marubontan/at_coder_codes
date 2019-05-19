import java.util.Scanner

object SnakeToy {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, k) = sc.nextLine.split(" ").map(_.toInt)
    println(sc.nextLine.split(" ").map(_.toInt).sorted.reverse.slice(0, k).sum)
  }
}
