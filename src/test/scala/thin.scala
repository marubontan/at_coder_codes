import java.util.Scanner

object Thin {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(h, w) = sc.nextLine.split(" ").map(_.toInt)
    val rectangle = List.fill(h)(sc.nextLine)
    (1 to 2 * h).map{
      ind => rectangle((ind - 1)/2)
    }.foreach(println)
  }
}
