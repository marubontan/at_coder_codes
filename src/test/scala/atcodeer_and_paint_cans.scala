import java.util.Scanner

object AtcodeerAndPaintCans {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    println(sc.nextLine.split(" ").distinct.length)
  }
}
