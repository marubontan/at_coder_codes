import java.util.Scanner

object Garden {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    println(a * b - (a + b - 1))
  }

}
