import java.util.Scanner

object Kaki {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    println(Iterator.continually(sc.nextLine).take(12).count(item => item.contains("r")))
  }
}
