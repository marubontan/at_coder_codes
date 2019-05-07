import java.util.Scanner

object Abd {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextInt
    if (n >= 1000) println("ABD")
    else println("ABC")
  }

}
