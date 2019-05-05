object AtCoder{
  def main(args: Array[String]): Unit = {
    val input = io.StdIn.readLine.toString

    @annotation.tailrec
    def go(s: String, sumVal: Int, sumValStorage: List[Int], n: Int): List[Int] ={
      if (n < 0) {
        sumValStorage :+ sumVal
      }
      else {
        if (Set("A", "C", "G", "T").contains(s(n).toString)) {
          go(s, sumVal + 1, sumValStorage, n-1)
        }
        else {
          go(s, 0, sumValStorage :+ sumVal, n-1)
        }
        
      }
    }

    println(go(input, 0, List[Int](), input.length-1).max)
  }
}