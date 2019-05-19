import java.util.Scanner

object Ss {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val word = sc.next

    def go(n: Int): Int ={
      if (n % 2 == 0 & word.slice(0, n / 2) == word.slice(n / 2, n)) n
      else go(n - 1)
    }
    println(go(word.length - 1))
  }
}
