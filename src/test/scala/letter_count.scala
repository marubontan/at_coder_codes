import java.util.Scanner

object LetterCount {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val letters = sc.nextLine
    val abcdef = Array("A", "B", "C", "D", "E", "F")
    println(abcdef.map(s => letters.count(_.toString == s)).mkString(" "))
  }
}
