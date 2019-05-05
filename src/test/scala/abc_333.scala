import java.util.Scanner

object Abc333 {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val even = sc.nextLine.split(" ").map(_.toInt).filter(_ % 2 == 0)
    if (even.length == 0) println("Yes")
    else println("No")
  }
}
