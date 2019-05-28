import java.util.Scanner

object Lock {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val a = sc.nextLine.toInt
    val b = sc.nextLine.toInt
    if (a > b) {
      println(Array(a - b, b + (10 - a)).min)
    } else {
      println(Array(b - a, a + (10 - b)).min)
    }
  }
}
