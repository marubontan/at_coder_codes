import io.StdIn._

object ChristmassEve {
  def main(args: Array[String]): Unit = {
    val Array(n, k) = readLine.split(" ").map(_.toInt)
    val trees = (for {_ <- 1 to n} yield readInt()).sorted
    println(trees.sliding(k).map(item => item.last - item.head).min)
  }
}