import java.util.Scanner
import scala.collection.mutable

object CollatzProblem {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val initialState: Int = sc.nextLine.toInt

    @annotation.tailrec
    def go(n: Int, prevValue:Int, acc: mutable.Set[Int]): Int = {
      val value: Int = prevValue % 2 match {
        case 0 => prevValue / 2
        case 1 => 3 * prevValue + 1
      }
      if (acc.contains(value)) n
      else {
        acc += value
        go(n + 1, value, acc)
      }
    }
    val initialSet: mutable.Set[Int] = mutable.Set(initialState)
    println(go(2, initialState, initialSet))
  }

}
