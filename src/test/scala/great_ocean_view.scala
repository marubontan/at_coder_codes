import java.util.Scanner

object GreatOceanView {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    sc.nextLine()
    //    check the difference between array and list
    val heights: Array[Int] = sc.nextLine().split(" ").map { s => s.toInt }

    @annotation.tailrec
    def go(n: Int, maxHeight: Int, niceViewsNumber: Int): Int = {
      if (n == heights.length)
        niceViewsNumber
      else {
        if (heights(n) >= maxHeight) {
          go(n + 1, heights(n), niceViewsNumber + 1)
        } else {
          go(n + 1, maxHeight, niceViewsNumber)
        }
      }
    }

    val ans = heights.foldLeft((0, 0)){
      case ((acc, max), i) => {
        if (i >= max) (acc + 1, i)
        else (acc, max)
      }
    }
    println(ans._1)

  }
}

