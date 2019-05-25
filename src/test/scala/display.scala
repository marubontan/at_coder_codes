import java.util.Scanner

object Display {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(w, h) = sc.nextLine.split(" ").map(_.toInt)
    val displayTwo = sc.nextLine.split(" ").map(_.toInt)
    if (displayTwo.contains(w) | displayTwo.contains(h)) println("YES")
    else println("NO")
  }
}
