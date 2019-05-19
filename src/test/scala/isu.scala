import java.util.Scanner

object Isu {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(x, y, z) = sc.nextLine.split(" ").map(_.toInt)
    if (x % (y + z) >= z) println(x / (y + z))
    else println((x / (y + z)) - 1)
  }
}
