import java.util.Scanner

object ColorfulTransceivers {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c, d) = sc.nextLine.split(" ").map(_.toInt)
    if (Math.abs(c - a) <= d) println("Yes")
    else if (Math.abs(b - a) <= d & Math.abs(c - b) <= d) println("Yes")
    else println("No")
  }

}
