import java.util.Scanner

object GrandGarden {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    sc.nextLine()
    val heights = sc.nextLine.split(" ").map(_.toInt)
    println((1 to heights.max).map {
      h => heights.map(i => if (h <= i) 1 else 0).mkString.split("0").filterNot(_ == "").length
    }.sum)
  }
}
