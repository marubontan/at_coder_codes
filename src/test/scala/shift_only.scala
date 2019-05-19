import java.util.Scanner

object ShiftOnly {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    sc.nextLine()
    val num: Array[Int] = sc.nextLine.split(" ").map(_.toInt)

    def go(target: Array[Int], acc: Int): Int = {
      if (target.count(_ % 2 == 0) == target.length) go(target.map(_ / 2), acc + 1)
      else acc
    }

    println(go(num, 0))
  }
}
