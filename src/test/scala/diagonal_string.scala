import java.util.Scanner

object DiagonalString {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val matrix = List.fill(3)(sc.nextLine)
    println(matrix.zipWithIndex.map { item => item._1(item._2) }.mkString)
  }
}
