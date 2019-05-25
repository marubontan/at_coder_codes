import java.util.Scanner

object CardGameForThree {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val sA = scala.collection.mutable.Queue(sc.nextLine.split(""): _*)
    val sB = scala.collection.mutable.Queue(sc.nextLine.split(""): _*)
    val sC = scala.collection.mutable.Queue(sc.nextLine.split(""): _*)

    val aFirst: String = sA.dequeue()

    def go(turn: String): String = {
      if (sA.isEmpty & turn == "a") "A"
      else if (sB.isEmpty & turn == "b") "B"
      else if (sC.isEmpty & turn == "c") "C"
      else {
        if (turn == "a") go(sA.dequeue)
        else if (turn == "b") go(sB.dequeue)
        else go(sC.dequeue)
      }
    }

    println(go(aFirst))

  }
}
