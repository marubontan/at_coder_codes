import scala.io.StdIn._

object TrainTicket {
  def main(args: Array[String]): Unit = {
    val numbers = readLine().map(_.toString.toInt).toList

    var ans: String = numbers.head.toString

    def go(num: List[Int], sumValue: Int, res: String): Boolean = {
      if (num.isEmpty) {
        if (sumValue == 7) {
          ans += res + "=7"
          true
        }
        else false
      } else {
        go(num.tail, sumValue + num.head, Array(res, "+", num.head.toString).mkString("")) ||
          go(num.tail, sumValue - num.head, Array(res, "-", num.head.toString).mkString(""))
      }
    }

    go(numbers.tail, numbers.head, "")
    println(ans)
  }
}
