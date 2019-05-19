import java.util.Scanner

object HarshadNumber {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    if (n % n.toString.split("").map(_.toInt).sum == 0) println("Yes")
    else println("No")
  }
}
