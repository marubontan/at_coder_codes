import java.util.Scanner

object SevenFiveFive {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextLine
    var acc = scala.collection.mutable.ArrayBuffer[String]()

    def go(n: Int, s: String): Unit = {
      if (n == 0) {
        acc += s
      } else {
        go(n - 1, s + "3")
        go(n - 1, s + "5")
        go(n - 1, s + "7")
        go(n - 1, s + "0")
      }
    }

    go(n.length, "")
    println(acc.map(_.toInt).filter(_ <= n.toInt).count(s => s.toString.distinct.length == 3 & !s.toString.contains("0")))
  }
}
