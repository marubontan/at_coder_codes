import java.util.Scanner

object Trained {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.next.toInt
    val bottons = List.fill(n)(sc.nextInt)
    val indexBottonMap = bottons.zipWithIndex.map(item => (item._2, item._1)).toMap

    def go(n: Int, k: Int, acc: Int): Int = {
      if (n == -1) -1
      else if (k == 2) acc
      else {
        go(n - 1, indexBottonMap(k - 1), acc + 1)
      }
    }

    println(go(n, 1, 0))
  }
}
