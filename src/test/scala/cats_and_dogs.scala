import java.util.Scanner

object CatsAndDogs {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, x) = sc.nextLine.split(" ").map(_.toInt)
    if (x > a + b) println("NO")
    else if (x < a) println("NO")
    else println("YES")
  }
}
