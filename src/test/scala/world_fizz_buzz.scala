import java.util.Scanner

object WorldFizzBuzz {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextInt
    if (n % 3 == 0) println("YES")
    else println("NO")
  }
}
