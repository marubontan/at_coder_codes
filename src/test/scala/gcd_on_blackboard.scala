import java.util.Scanner

object GcdOnBlackboard {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    sc.nextLine()

    val numbers: List[Int] = sc.nextLine().split(" ").map(_.toInt).toList
    if (numbers.distinct.length == 1) {
      println(numbers.head)
    } else {
      val left: List[Int] = numbers.scanLeft(numbers.head)((prev, post) => gcd(prev, post)).drop(1)
      val right: List[Int] = numbers.scanRight(numbers.last)((prev, post) => gcd(prev, post)).dropRight(1)
      val ans = numbers.zipWithIndex.map {
        item =>
          if (item._2 == 0) right(1)
          else if (item._2 == numbers.length - 1) left(left.length - 2)
          else {
            gcd(left(item._2 - 1), right(item._2 + 1))
          }
      }.max

      println(ans)
    }

  }

  def gcd(x: Int, y: Int): Int = {
    if (y == 0) x
    else gcd(y, x % y)
  }
}