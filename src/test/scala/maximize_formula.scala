import java.util.Scanner

object MaximizeFormula {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val sortedNumbers = sc.nextLine.split(" ").map(_.toInt).sorted.reverse
    println((sortedNumbers.head.toString + sortedNumbers(1)).toInt + sortedNumbers(2))
  }

}
