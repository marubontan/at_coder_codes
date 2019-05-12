import java.util.Scanner

object PalindromicNumber {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val number: String = sc.nextLine()
    if (number(0) == number(2)) println("Yes")
    else println("No")
  }
}
