import java.util.Scanner

object BathTime {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val seconds = sc.nextLine.toInt
    println(Array("%02d".format(seconds / 3600), "%02d".format((seconds % 3600) / 60), "%02d".format((seconds % 3600) % 60)).mkString(":"))
  }
}
