import java.util.Scanner

object Buttons {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val buttons: Array[Int] = sc.nextLine().split(" ").map(k => k.toInt)

    @annotation.tailrec
    def go(button1:Int, button2: Int, n: Int, acc: Int): Int ={
      if (n==0)
        acc
      else{
        if (button1 >= button2) {
          val outcome = getNumberFromBotton(button1)
          go(outcome._2, button2, n -1, acc + outcome._1)
        }
        else {
          val outcome = getNumberFromBotton(button2)
          go(button1, outcome._2, n -1, acc + outcome._1)
        }
      }
    }
    println(go(buttons(0), buttons(1), 2, 0))


  }

  def getNumberFromBotton(button: Int): Tuple2[Int, Int] = {
    Tuple2(button, button - 1)
  }
}