import java.util.Scanner

object TakahashiAokiFavoriteNumber {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val a = sc.nextLine.toInt
    val b = sc.nextLine.toInt
    val n = sc.nextLine.toInt

    def go(n: Int): Int = {
      if (n % a == 0 && n % b == 0) n
      else go(n + 1)
    }
    println(go(n))
  }
}
