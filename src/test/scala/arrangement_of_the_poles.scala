import java.util.Scanner

object ArrangementOfThePoles {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ").map(_.toInt)
    if (b - a == c - b) println("YES")
    else println("NO")
  }
}
