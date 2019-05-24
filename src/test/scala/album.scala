import java.util.Scanner

object Album {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(s, t) = sc.nextLine.split(" ").map(_.toInt)
    println(t - s + 1)
  }
}
