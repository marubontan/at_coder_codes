import java.util.Scanner

object CanYouSolveThis {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, _, c) = sc.nextLine.split(" ").map(_.toInt)
    val b: Array[Int] = sc.nextLine.split(" ").map(_.toInt)

    @annotation.tailrec
    def go(n: Int, accT: Int): Int = {
      if (n == 0) accT
      else {
        val linear = (sc.nextLine.split(" ").map(_.toInt) zip b).foldLeft(0)(
          (acc, item)
          => {
            item._1 * item._2 + acc}
        ) + c

        val total: Int = linear match {
          case m if m > 0 => 1
          case _ => 0
        }
        go(n - 1, accT + total)
      }
    }

    println(go(n, 0))

  }
}