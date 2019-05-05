import java.util.Scanner

object ChristmasEveEveEve {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val day: Int = sc.nextLine.toInt

    val dayName: String = day match {
      case 25 => "Christmas"
      case 24 => "Christmas Eve"
      case 23 => "Christmas Eve Eve"
      case 22 => "Christmas Eve Eve Eve"
    }
    println(dayName)
  }
}
