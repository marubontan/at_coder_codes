import java.util.Scanner

object CheckName {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val name = sc.nextLine
    println(name.head.toUpper + name.tail.toLowerCase)
  }
}
