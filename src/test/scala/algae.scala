import java.util.Scanner

object Algae {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(r, d, x) = sc.nextLine.split(" ").map(_.toInt)
    (1 to 10).scanLeft(x){
      (n, _) => r * n - d
    }.slice(1, 11).foreach(println)
  }
}
