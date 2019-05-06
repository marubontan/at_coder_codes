import java.util.Scanner

object AcCepted {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val letters: String = sc.nextLine()
    if (letters.head != 'A') println("WA")
    else if (letters.slice(2, letters.length - 1).filter(_ == 'C').length != 1) println("WA")
    else if (letters.slice(1, letters.length).filter(_.isUpper).length != 1) println("WA")
    else println("AC")
  }

}
