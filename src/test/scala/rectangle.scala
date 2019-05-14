import java.util.Scanner

object Rectangle {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(lOne, lTwo, lThree) = sc.nextLine.split(" ").map(_.toInt).sorted
    if (lOne == lTwo) println(lThree)
    else println(lOne)
  }
}
