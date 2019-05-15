import java.util.Scanner

object KagamiMochi {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    val numbers = List.fill(n)(sc.nextInt)
    println(numbers.distinct.length)
  }
}
