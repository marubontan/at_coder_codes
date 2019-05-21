import java.util.Scanner

object AgeOfTakahashi {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val ages = sc.nextLine.split(" ").map(_.toInt).sorted
    println(ages(1))
  }
}
