import java.util.Scanner

object Beans {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val scores = List.fill(3)(sc.nextInt)
    scores.zipWithIndex.sortBy(item => item._1).reverse.map(_._2 + 1).foreach(println)
  }
}
