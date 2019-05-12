import java.util.Scanner

object OneOutOfThree {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val numbers = sc.nextLine.split(" ").map(_.toInt)
    val majority = numbers.sorted.toList(1)
    println(numbers.filterNot(n => n == majority)(0))
  }
}
