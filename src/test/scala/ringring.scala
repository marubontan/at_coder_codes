import java.util.Scanner

object RingRing {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val bells = sc.nextLine.split(" ").map(_.toInt).sorted
    println(bells(0) + bells(1))
  }
}
