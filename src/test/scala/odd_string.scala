import java.util.Scanner

object OddString {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val ans = sc.next.split("").zipWithIndex.filter(valInd => valInd._2 % 2 == 0).map(_._1).mkString
    println(ans)
  }
}
