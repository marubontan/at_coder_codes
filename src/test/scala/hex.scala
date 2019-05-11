import java.util.Scanner

object Hex {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(left, right): Array[String] = sc.nextLine.split(" ")
    if (left == right) println("=")
    else if (left > right) println(">")
    else println("<")
  }
}
