import java.util.Scanner

object PostalCode {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, _) = sc.nextLine.split(" ").map(_.toInt)
    val s: String = sc.nextLine
    if (s.filter(_.toString == "-").length != 1) println("No")
    else {
      if (s.takeWhile(_.toString != "-").length == a) println("Yes")
      else println("No")
    }
  }
}
