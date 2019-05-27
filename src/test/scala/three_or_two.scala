import java.util.Scanner

object ThreeOrTwo {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    sc.nextLine()
    val numberSequence = sc.nextLine.split(" ").map(_.toInt)

    @annotation.tailrec
    def go(num: Int, acc: Int): Int = {
      if (num % 2 != 0) acc
      else go(num / 2, acc + 1)
    }

    println(numberSequence.map(go(_, 0)).sum)
  }
}