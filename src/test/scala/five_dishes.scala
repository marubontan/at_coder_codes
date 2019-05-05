import java.util.Scanner

object FiveDishes {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)

    val a: String = sc.nextLine
    val b: String = sc.nextLine
    val c: String = sc.nextLine
    val d: String = sc.nextLine
    val e: String = sc.nextLine

    val partitioned = List(a, b, c, d, e).partition(item => item.last == '0')
    val ans: Int = (partitioned._2.sortBy(item => item.last).zipWithIndex.map {
      case (item, index) => if (index == 0) item.toInt
      else if (item.last == '0') item.toInt
      else {
        (((item.toInt / 10.0).toInt + 1) * 10.0).toInt
      }
    } ::: partitioned._1.map {
      _.toInt
    }).sum
    println(ans)


  }
}