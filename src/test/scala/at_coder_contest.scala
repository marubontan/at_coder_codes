import java.util.Scanner

object AtCoderContest {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    println(sc.nextLine.split(" ").map(_.head).mkString)
  }
}
