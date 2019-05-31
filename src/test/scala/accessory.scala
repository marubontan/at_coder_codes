import java.util.Scanner

object Accessory {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextLine.toInt
    val s = sc.nextLine

    def go(k: Int, acc: String): String = {
      if (k == (n / 2) + 1) acc
      else {
        if (k % 3 == 1) go(k + 1, "a" + acc + "c")
        else if (k % 3 == 2) go(k + 1, "c" + acc + "a")
        else go(k + 1, "b" + acc + "b")
      }
    }

    if (go(1, "b") == s) println((n / 2))
    else println(-1)
  }
}
