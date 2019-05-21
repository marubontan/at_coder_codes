import java.util.Scanner

object PictureFrame {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(h, w) = sc.nextLine.split(" ").map(_.toInt)
    val frame = List.fill(h)(sc.nextLine)
    val edgeRow = "#" * (w + 2)
    val ans = edgeRow +: frame.map(cols => "#" ++ cols ++ "#") :+ edgeRow
    ans.foreach(println)
  }
}
