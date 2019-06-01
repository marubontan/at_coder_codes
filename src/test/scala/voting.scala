import java.util.Scanner

object Voting {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextLine.toInt
    val tickets = List.fill(n)(sc.nextLine)
    println(tickets.groupBy(l => l).map(i => (i._1, i._2.length)).toSeq.maxBy(_._2)._1)
  }
}
