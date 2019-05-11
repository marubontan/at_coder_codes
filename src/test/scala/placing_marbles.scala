import java.util.Scanner

object PlacingMarbles {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    println(sc.nextLine.split("").count(s => s == "1"))
  }
}
