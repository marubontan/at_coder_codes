import java.util.Scanner

object ExerciseManagement {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(l, h) = sc.nextLine.split(" ").map(_.toInt)
    val n = sc.nextLine.toInt
    val times = List.fill(n)(sc.nextLine.toInt)
    times.foreach { t =>
      if (t < l) println(l - t)
      else if (t > h) println(-1)
      else println(0)
    }
  }
}
