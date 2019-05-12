import java.util.Scanner

object RgbCards {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    if ( sc.nextLine.split(" ").mkString("").toInt % 4 == 0) println("YES")
    else println("NO")
  }
}
