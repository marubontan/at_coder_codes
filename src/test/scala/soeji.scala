import java.util.Scanner

object Soeji {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val s = sc.nextLine()
    val i = sc.nextLine.toInt
    println(s(i - 1))
  }
}
