import java.util.Scanner

object Chocolate {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    val Array(d, x) = sc.nextLine.split(" ").map(_.toInt)
    val participants: List[Int] = List.fill(n)(sc.nextInt)
    println(participants.map(
      day => (0 to d).map(i => i * day + 1).takeWhile(i => i<=d).length
    ).sum + x)
  }

}
