import java.util.Scanner

object AbcArc {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    if (sc.nextLine.toInt < 1200) println("ABC")
    else println("ARC")
  }
}
