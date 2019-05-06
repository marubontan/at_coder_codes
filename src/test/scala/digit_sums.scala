import java.util.Scanner

object DigitSums {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: String = sc.nextLine()

    if (n.toInt % n.foldLeft(0)((acc, i) => acc + i.toString.toInt) == 0) println("Yes")
    else println("No")
  }

}
