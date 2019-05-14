import java.util.Scanner

object MaxMultiplication {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val a = sc.nextLine.toInt
    println((a / 2) * (a / 2))
  }
}
