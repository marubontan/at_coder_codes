import java.util.Scanner

object Comparison {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val a: BigInt = BigInt(sc.next)
    val b: BigInt = BigInt(sc.next)
    if (a == b) println("EQUAL")
    else if (a > b) println("GREATER")
    else println("LESS")
  }
}
