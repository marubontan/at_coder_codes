import java.util.Scanner

object AroundSquare {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    println(math.pow(math.sqrt(n).toInt, 2).toInt)
  }
}
