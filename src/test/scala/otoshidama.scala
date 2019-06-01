import java.util.Scanner

object Otoshidama {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, y) = sc.nextLine.split(" ").map(_.toInt)

    val max10000 = y / 10000

    val comb = for {i <- 0 to Array(max10000, n).min
                    j <- 0 to Array((y - 10000 * i) / 5000, n - i).min} yield (i, j, n - i - j)
    val candidatesCombinations = comb.dropWhile(item => 10000 * item._1 + 5000 * item._2 + 1000 * item._3 != y)
    if (candidatesCombinations.isEmpty) println("-1 -1 -1")
    else {
      val ans = candidatesCombinations.head
      println(ans._1.toString + " " + ans._2.toString + " " + ans._3.toString)
    }
  }
}
