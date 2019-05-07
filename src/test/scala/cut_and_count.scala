import java.util.Scanner

object CutAndCount {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    val s = sc.nextLine

    println((0 until n).foldLeft(0) {
      (acc, i) => Array(acc, s.slice(0, i).split("").toSet.intersect(s.slice(i, s.length).split("").toSet).size).max
    })
  }

}
