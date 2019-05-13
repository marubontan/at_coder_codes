import java.util.Scanner

object Grouping {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(x, y) = sc.nextLine.split(" ").map(_.toInt)
    val groupOne = Array(1, 3, 5, 7, 8, 10, 12)
    val groupTwo = Array(4, 6, 9, 11)
    if ((groupOne.contains(x) & groupOne.contains(y)) | (groupTwo.contains(x) & groupTwo.contains(y))) println("Yes")
    else println("No")
  }
}
