import java.util.Scanner

object ThreeLetterAcronym {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val words: Array[String] = sc.nextLine.split(" ")
    println(words.map(_ (0)).map(_.toUpper).mkString(""))
  }
}
