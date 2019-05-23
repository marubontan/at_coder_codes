import java.util.Scanner

object AToZString {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val letter = sc.nextLine
    println(letter.dropWhile(_ != 'A').reverse.dropWhile(_ != 'Z').length)
  }
}
