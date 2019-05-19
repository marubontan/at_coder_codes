import java.util.Scanner

object AdditionAndMultiplication {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt
    val k: Int = sc.nextLine.toInt

    def go(n: Int, acc: Int): Int ={
      if (n == 0) acc
      else{
        if (acc < k) go(n-1, acc * 2)
        else go(n-1, acc + k)
      }
    }
    println(go(n, 1))
  }
}
