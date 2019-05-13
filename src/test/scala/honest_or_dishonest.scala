import java.util.Scanner

object HonestOrDishonest {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ")
    if (a == b) println("H")
    else println("D")
  }
}
