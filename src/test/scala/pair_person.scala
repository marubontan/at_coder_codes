import java.util.Scanner

object PairPerson {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = math.BigInt(sc.nextLine)
    if (n % 2 == 0) println(n - 1)
    else println(n + 1)
  }
}
