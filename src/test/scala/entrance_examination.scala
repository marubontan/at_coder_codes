import java.util.Scanner

object EntranceExamination{
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(t, x) = sc.nextLine.split(" ").map(_.toDouble)
    println(t / x)
  }
}