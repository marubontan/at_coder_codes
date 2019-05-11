import java.util.Scanner

object NewYear {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val m: Int = sc.nextInt

    println(24 + (24 - m))
  }
}
