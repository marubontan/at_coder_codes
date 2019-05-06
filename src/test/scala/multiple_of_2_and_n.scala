import java.util.Scanner

object MultipleOfTwoAndN {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextInt()
    if (n % 2 == 1) println(n * 2)
    else println(n)
  }

}
