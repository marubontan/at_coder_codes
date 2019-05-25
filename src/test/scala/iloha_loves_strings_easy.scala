import java.util.Scanner

object IlohaLovesStringsEasy {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, _) = sc.nextLine.split(" ").map(_.toInt)
    val words = List.fill(n)(sc.nextLine)
    println(words.sorted.mkString)
  }
}
