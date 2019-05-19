import java.util.Scanner

object Theater {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    val range = List.fill(n)(sc.nextLine.split(" ").map(_.toInt))
    println(range.foldLeft(0)((acc, ran) => acc + (ran(1) - ran(0)) + 1))
  }
}
