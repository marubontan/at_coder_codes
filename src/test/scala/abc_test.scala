import java.util.Scanner

object AbcTest {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(x, y) = sc.nextLine.split(" ").map(_.toInt)
    if ( x < y) println("Better")
    else println("Worse")
  }
}
