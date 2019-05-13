import java.util.Scanner

object Ocha {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    if (sc.nextLine.last == 'T') println("YES")
    else println("NO")
  }
}
