import java.util.Scanner

object OneHundredFive {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val number: Int = sc.nextLine.toInt
    if (number < 105) println(0)
    else {
      println((105 to number).filter(_ % 2 == 1).map {
        n =>
          (1 to number).foldLeft(0) {
            case (acc, d) if n % d == 0 => acc + 1
            case (acc, _) => acc
          }
      }.count(_ == 8))
    }
  }
}
