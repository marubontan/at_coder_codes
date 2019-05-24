import java.util.Scanner

object SalaryOfAtcoder {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextInt
    println((1 to n).map(_ * 10000).sum / n.toDouble)
  }
}
