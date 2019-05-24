import java.util.Scanner

object SunukeColoringEasy {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(w, h, n) = sc.nextLine.split(" ").map(_.toInt)
    val black = List.fill(n)(sc.nextLine.split(" ").map(_.toInt))

    val xZeros = black.filter(_ (2) == 1)
    val xOnes = black.filter(_ (2) == 2)
    val yZeros = black.filter(_ (2) == 3)
    val yOnes = black.filter(_ (2) == 4)

    val xZero = if (xZeros.isEmpty) 0 else xZeros.map(_ (0)).max
    val xOne = if (xOnes.isEmpty) w else xOnes.map(_ (0)).min
    val yZero = if (yZeros.isEmpty) 0 else yZeros.map(_ (1)).max
    val yOne = if (yOnes.isEmpty) h else yOnes.map(_ (1)).min

    val xLength = if (xOne >= xZero) xOne - xZero else 0
    val yLength = if (yOne >= yZero) yOne - yZero else 0

    println(xLength * yLength)
  }
}
