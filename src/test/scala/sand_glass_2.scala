import java.util.Scanner

object SandGlassTwo {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(x, t) = sc.nextLine.split(" ").map(_.toInt)
    println(Array(0, x-t).max)
  }
}
