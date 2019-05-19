import java.util.Scanner

object TwoAnagrams {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val s: String = sc.nextLine()
    val t: String = sc.nextLine()

    if (s.sorted < t.sorted.reverse) println("Yes")
    else println("No")
  }
}
