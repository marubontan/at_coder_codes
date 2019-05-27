import java.util.Scanner

object AddingB {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val ab = sc.nextLine.split(" ")
    println(ab.mkString("").toInt * 2)
  }
}
