import java.util.Scanner

object ShiritoriA {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ")
    if (a.last == b.head & b.last == c.head) println("YES")
    else println("NO")
  }
}
