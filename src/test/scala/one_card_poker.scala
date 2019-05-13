import java.util.Scanner

object OneCardPoker {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    if (a == b) println("Draw")
    else if (a == 1) println("Alice")
    else if (b == 1) println("Bob")
    else if (a > b) println("Alice")
    else println("Bob")
  }
}
