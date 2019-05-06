import java.util.Scanner

object Train {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val train = sc.nextLine.split(" ").map(_.toInt)
    println(train.head - train.last + 1)
  }

}
