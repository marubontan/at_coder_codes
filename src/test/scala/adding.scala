import java.util.Scanner

object Adding {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.next.toInt
    println(n)
    (1 to n).foreach(_ => println(1))
  }
}
