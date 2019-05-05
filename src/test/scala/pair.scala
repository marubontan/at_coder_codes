import java.util.Scanner

object Pair {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(even, odd) = sc.nextInt  match{
      case i if i % 2 == 0 => Array(i/2, i/2)
      case i => Array(i/2, i/2 + 1)
    }
    println(even * odd)
  }

}
