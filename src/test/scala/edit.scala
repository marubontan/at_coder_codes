import java.util.Scanner

object Edit {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(n, q) = sc.nextLine.split(" ").map(_.toInt)
    val ranges = List.fill(q)(sc.nextLine.split(" ").map(_.toInt))
    val ans = scala.collection.mutable.ListBuffer(List.fill(n)(0): _*)
    ranges.foreach{
      rn => (rn(0) - 1 until rn(1)).foreach(ans(_) = rn(2))
    }
    ans.foreach(println)
  }
}
