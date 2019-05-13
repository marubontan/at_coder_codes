import java.util.Scanner

object Haiku {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    println(sc.nextLine.split(",").mkString(" "))
  }
}
