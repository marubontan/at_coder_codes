import java.util.Scanner

object Unification {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val s: String = sc.next()
    val (zero, one) = s.partition(_.toString == "0")
    println(Array(zero.length, one.length).min * 2)
  }
}
