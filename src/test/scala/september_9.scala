import java.util.Scanner

object SeptemberNine {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    if (sc.nextLine.split("").contains("9")) println("Yes")
    else println("No")
  }
}
