import java.util.Scanner

object A {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val x = sc.nextLine
    if (x == "A") println("1")
    else if (x == "B") println("2")
    else if (x == "C") println("3")
    else if (x == "D") println("4")
    else println("5")
  }
}
