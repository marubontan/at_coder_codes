import java.util.Scanner

object ChangingCharacter {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(_, k) = sc.nextLine.split(" ").map(_.toInt)
    val letters = sc.next
    println(letters.zipWithIndex.map {
      item =>
        if (item._2 == k - 1) item._1.toLower
        else item._1
    }.mkString)
  }
}
