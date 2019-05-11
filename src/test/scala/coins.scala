import java.util.Scanner

object Coins {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val a: Int = sc.nextLine.toInt
    val b: Int = sc.nextLine.toInt
    val c: Int = sc.nextLine.toInt
    val x: Int = sc.nextLine.toInt
    val combination = for {av <- 0 to a; bv <- 0 to b; cv <- 0 to c} yield (av, bv, cv)
    println(combination.map(comb => comb._1 * 500 + comb._2 * 100 + comb._3 * 50).count(_ == x))
  }
}
