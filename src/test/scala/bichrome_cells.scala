import java.util.Scanner

object BichromeCells {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    val a: Int = sc.nextLine.toInt
    println(n * n - a)
  }
}
