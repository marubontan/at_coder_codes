import java.util.Scanner

object FightingOverCandies {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ").map(_.toInt).sorted
    if (a + b == c) println("Yes")
    else println("No")
  }
}
