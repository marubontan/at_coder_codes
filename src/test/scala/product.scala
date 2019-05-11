import java.util.Scanner

object Product {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    if (!sc.nextLine.split(" ").map(_.toInt).exists(_ % 2 == 0)) println("Odd")
    else println("Even")
  }
}
