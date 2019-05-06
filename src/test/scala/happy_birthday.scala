import java.util.Scanner

object HappyBirthday {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b) = sc.nextLine.split(" ").map(_.toInt)
    if ((a <= 8) & (b <= 8)) println("Yay!")
    else println(":(")
  }

}
