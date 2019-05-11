import java.util.Scanner

object PalindromicNumbers {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    print((a to b).map(_.toString).count(number => number(0) == number(4) & number(1) == number(3)))
  }

}
