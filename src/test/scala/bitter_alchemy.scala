import java.util.Scanner

object BitterAlchemy {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, x): Array[Int] = sc.nextLine.split(" ").map(_.toInt)
    val ms = List.fill(n)(sc.nextInt)
    val additional: Int = (x - ms.sum) / ms.min
    println(n + additional)
  }

}
