import java.util.Scanner
import scala.collection.immutable

object SevenFiveThree {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val output: String = sc.nextLine.toInt match {
      case a if immutable.Set(7, 5, 3).contains(a) => "YES"
      case _ => "NO"
    }
    println(output)
  }
}
