import java.util.Scanner

object TrainingCamp {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.next.toInt
    println((1 to n).foldLeft(1L){(a,b) => (a * b) % 1000000007 })
  }
}
