import java.util.Scanner

object ChooseIntegers {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ").map(_.toInt)
    if ((1 to b).exists(i => i * a % b == c)) println("YES")
    else println("NO")
  }
}
