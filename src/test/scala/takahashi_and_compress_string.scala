import java.util.Scanner

object TakahashiAndCompressString {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val s = sc.nextLine

    def go(ind: Int, oneBefore: String, acc: Array[Int]): Array[Int] = {
      if (ind == s.length) acc
      else if (s(ind).toString == oneBefore) go(ind + 1, s(ind).toString, acc)
      else go(ind + 1, s(ind).toString, acc :+ ind)
    }

    val splitPoints = go(0, "0", Array()) :+ s.length
    println(splitPoints.sliding(2).map(ind => s(ind.head).toString + (ind.last - ind.head).toString).mkString(""))
  }
}
