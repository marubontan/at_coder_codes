import java.util.Scanner

object AnshoBango {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    if (sc.nextLine.toInt % 1111 == 0) println("SAME")
    else println("DIFFERENT")
  }
}
