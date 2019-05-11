import java.util.Scanner

object CardGameForTwo {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    sc.nextLine()
    val cards: Array[Int] = sc.nextLine.split(" ").map(_.toInt).sorted.reverse
    val (alice, bob) = cards.zipWithIndex.partition(item => item._2 % 2 == 0)
    println(alice.map(_._1).sum - bob.map(_._1).sum)
  }

}
