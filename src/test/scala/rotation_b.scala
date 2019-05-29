import java.util.Scanner

object RotationB {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val matrix = List.fill(4)(sc.nextLine.split(" "))
    matrix.reverse.map(_.reverse.mkString(" ")).foreach(println)
  }
}
