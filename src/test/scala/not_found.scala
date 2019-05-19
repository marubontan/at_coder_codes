import java.util.Scanner

object NotFound {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val alphabets = sc.nextLine.split("").toSet
    val allAlphabets = "abcdefghijklmnopqrstuvwxyz".split("").toSet
    if ((allAlphabets diff alphabets).isEmpty) println("None")
    else println((allAlphabets diff alphabets).toList.min)
  }
}
