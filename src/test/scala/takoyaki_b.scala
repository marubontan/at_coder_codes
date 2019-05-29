import java.util.Scanner

object TakoyakiB {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextLine.toInt
    println(List.fill(n)(sc.nextLine.toInt).min)
  }
}
