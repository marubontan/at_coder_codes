import java.util.Scanner

object KthCommonDivisor {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, k) = sc.nextLine.split(" ").map(_.toInt)


    @annotation.tailrec
    def go(n: Int, k: Int, gcdVal: Int): Int = {
      if (gcdVal % n == 0) {
        if (k == 1) {
          n
        }
        else go(n - 1, k - 1, gcdVal)
      }
      else go(n - 1, k, gcdVal)
    }


    def gcd(x: Int, y: Int): Int = {
      if (y == 0) x
      else gcd(y, x % y)
    }

    val gcdVal: Int = gcd(a, b)

    print(go(gcdVal, k, gcdVal))
  }
}