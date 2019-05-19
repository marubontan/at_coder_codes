import java.util.Scanner

object BreakNumber {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.next.toInt

    @annotation.tailrec
    def go(i: Int, acc: Int): Int = {
      if (i % 2 != 0) acc
      else go(i / 2, acc + 1)
    }

    val ans: Int = (1 to n).map(k => go(k, 0)).zipWithIndex.maxBy(_._1)._2 + 1
    println(ans)
  }
}
