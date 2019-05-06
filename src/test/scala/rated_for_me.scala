import java.util.Scanner

object RatedForMe {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val r: Int = sc.nextInt()
    if (r < 1200) println("ABC")
    else if (2800 <= r) println("AGC")
    else println("ARC")
  }

}
