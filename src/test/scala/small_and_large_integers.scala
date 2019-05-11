import java.util.Scanner

object SmallAndLargeIntegers {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, k) = sc.nextLine.split(" ").map(_.toInt)
    val targetArray = (a to b).toArray
    val possibleIndexLength = Array(k, targetArray.length).min
    val fromTop = targetArray.slice(0, possibleIndexLength)
    val fromLast = targetArray.reverse.slice(0, possibleIndexLength)

    (fromTop ++ fromLast).distinct.sorted.foreach(println(_))
  }

}
