import java.util.Scanner

object Moving {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextInt
    if (n % 2 == 0) println(n / 2)
    else println((n / 2) + 1)
  }
}
