import java.util.Scanner

object GoodInteger {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n = sc.nextLine
    if (Array(n(0), n(1), n(2)).distinct.length == 1 | Array(n(1), n(2), n(3)).distinct.length == 1) println("Yes")
    else println("No")
  }
}
