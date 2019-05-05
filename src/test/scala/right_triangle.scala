import java.util.Scanner

object RightTriangle {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(ab, bc, _) = sc.nextLine.split(" ").map(_.toInt)
    println(ab * bc / 2)
  }

}
