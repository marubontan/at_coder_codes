import java.util.Scanner

object ReverseLetters {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val s = sc.nextLine()
    val n = sc.nextLine.toInt
    val manipulations = List.fill(n)(sc.nextLine.split(" ").map(_.toInt))

    println(manipulations.foldLeft(s) {
      (acc, m) => acc.slice(0, m.head-1) + acc.slice(m.head-1, m.last).reverse + acc.slice(m.last, acc.length)
    })
  }
}
