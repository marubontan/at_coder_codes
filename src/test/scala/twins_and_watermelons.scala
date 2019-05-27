import java.util.Scanner

object TwinsAndWatermelons {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, a, b) = sc.nextLine.split(" ").map(_.toInt)
    val coordinate = List.fill(n)(sc.nextLine.split(" ")).map { v =>
      if (v.last.toInt <= a) Array(v.head, a.toString)
      else if (v.last.toInt >= b) Array(v.head, b.toString)
      else v
    }.map { i =>
      if (i.head == "West") -i.last.toInt
      else i.last.toInt
    }.sum
    if (coordinate < 0) println(Array("WEST", -coordinate).mkString(" "))
    else if (coordinate > 0) println(Array("EAST", coordinate).mkString(" "))
    else println("0")
  }
}

