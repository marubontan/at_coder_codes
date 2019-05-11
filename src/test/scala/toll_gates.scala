import java.util.Scanner

object TollGates {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(_, _, x) = sc.nextLine.split(" ").map(_.toInt)
    val targetArray = sc.nextLine.split(" ").map(_.toInt)
    val (small, big): (Array[Int], Array[Int]) = targetArray.partition(p => p < x)
    println(Array(small.length, big.length).min)
  }
}
