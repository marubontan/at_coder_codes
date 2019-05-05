import java.util.Scanner

object FoodsLovedByEveryone{
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, m) = sc.nextLine.split(" ").map(_.toInt)

    def go(n: Int, acc: Set[Int]): Set[Int]= {
      if (n == 0) acc
      else {
        go(n - 1, acc.intersect(sc.nextLine.split(" ").map(_.toInt).drop(1).toSet))
      }
    }
    println(go(n, (1 to m).toSet).size)
  }
}