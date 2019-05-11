import java.util.Scanner

object MaximumSum {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val abc: Array[Int] = sc.nextLine.split(" ").map(_.toInt).sorted.reverse
    val k: Int = sc.nextLine.toInt

    val ans: Int = (1 to k).foldLeft(abc) {
      (tempAbc, _) => Array(2 * tempAbc.head, tempAbc(1), tempAbc.last)
    }.sum
    println(ans)
  }

}
