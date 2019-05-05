import java.util.Scanner

object SevenFiveFour {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val numbers: String = sc.nextLine
    println((numbers.slice(0, numbers.length - 2), numbers.slice(1, numbers.length - 1), numbers.slice(2, numbers.length)).zipped.foldLeft(753) {
      (presentMin, item) => {
        Math.min(presentMin, Math.abs((item._1.toString + item._2.toString + item._3.toString).toInt - 753))
      }
    })
  }

}
