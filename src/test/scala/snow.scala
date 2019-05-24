import java.util.Scanner

object Snow {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val hOne = sc.nextLine.toInt
    val hTwo = sc.nextLine.toInt
    println(hOne - hTwo)
  }
}
