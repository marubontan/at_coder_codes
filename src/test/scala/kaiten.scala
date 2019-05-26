import java.util.Scanner

object Kaiten {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextLine.toInt
    val tiles = List.fill(n)(sc.nextLine)
    (0 until n).foreach(
      i => println(tiles.map(_ (i)).reverse.mkString)
    )
  }
}
