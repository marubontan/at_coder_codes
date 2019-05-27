import java.util.Scanner

object ChooseThreeNumbers {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val numbers = sc.nextLine.split(" ").map(_.toInt)
    println(numbers.combinations(3).toArray.map(_.sum).sorted.reverse(2))
  }
}
