import java.util.Scanner

object HinaArare {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    sc.nextLine()
    val arare: Array[String] = sc.nextLine.split(" ")
    if (arare.contains("Y")) println("Four")
    else println("Three")
  }
}
