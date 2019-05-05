import java.util.Scanner

object StillTDB {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(y, m, _) = sc.nextLine.split("/").map(_.toInt)

    if (y >= 2020) {
      println("TBD")
    } else if (y == 2019) {
      if (m >= 5) {
        println("TBD")
      } else {
        println("Heisei")
      }
    }
    else {
      println("Heisei")
    }
  }
}