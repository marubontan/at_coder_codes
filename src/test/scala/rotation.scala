import java.util.Scanner

object Rotation {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val first = sc.nextLine
    val second = sc.nextLine
    if (first(0) == second(2) & first(1) == second(1) & first(2) == second(0)) println("YES")
    else println("NO")
  }
}
