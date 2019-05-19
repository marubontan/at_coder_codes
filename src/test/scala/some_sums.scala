import java.util.Scanner

object SomeSums {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, a, b) = sc.nextLine.split(" ").map(_.toInt)
    println((1 to n).foldLeft(0) {
      (acc, num) =>
        num.toString.split("").map(_.toInt).sum match {
          case sumNum if a <=sumNum & sumNum <= b => acc + num
          case _ => acc
        }
    })
  }
}
