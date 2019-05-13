import java.util.Scanner

object IrohaAndHaikuAbc {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    if (sc.nextLine.split(" ").map(_.toInt).sorted sameElements Array(5, 5, 7)) println("YES")
    else println("NO")
  }
}
