import java.util.Scanner

object Tv {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(w, h) = sc.nextLine.split(" ").map(_.toInt)
    if (w * 3/4 == h) println("4:3")
    else println("16:9")
  }
}
