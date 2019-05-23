import java.util.Scanner

object IncrementDecrement {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    sc.nextLine.toInt
    val s = sc.next
    println(s.scanLeft(0) {
      case (a, b) if b == 'I' => a + 1
      case (a, b) if b == 'D' => a - 1
    }.max)
  }
}
