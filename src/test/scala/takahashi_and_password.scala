import java.util.Scanner

object TakahashiAndPassword {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val password = sc.nextLine
    val slidingRange = sc.nextLine.toInt
    if (slidingRange > password.length) println(0)
    else println(password.sliding(slidingRange).map(_.mkString).toArray.distinct.length)
  }
}
