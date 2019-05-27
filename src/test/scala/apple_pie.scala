import java.util.Scanner

object ApplePie {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(a, p) = sc.nextLine.split(" ").map(_.toInt)
    println((a * 3 + p) / 2)
  }
}
