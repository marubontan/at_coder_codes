import java.util.Scanner

object LucasNumber {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextLine.toInt

    def go(i: Int, prev: BigInt, post: BigInt): BigInt ={
      if (i == 0) prev
      else{
        go(i-1, post, prev+post)
      }
    }
    println(go(n, 2, 1))
  }
}
