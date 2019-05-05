import java.util.Scanner

object GetAc {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val indicesSetNumber = sc.nextLine().split(" ")(1).toInt
    getAC(sc, indicesSetNumber.toInt)
  }

  def getAC(sc: Scanner, indicesSetNumber: Int) = {
    val targetLetters: String = sc.nextLine()
    val acIndex: List[Int] = (targetLetters.slice(0, targetLetters.length() - 1) zip targetLetters.slice(1, targetLetters.length())).zipWithIndex.collect { case (elem, idx) if elem == ('A', 'C') => idx }.toList
    val acIndexLength: Int = acIndex.length

    def getAcNumberBefore(targetIndex: Int): Int = {
      acIndex.takeWhile(ind => ind < targetIndex).length
    }

    def getAcNumberAfter(targetIndex: Int): Int = {
      acIndex.dropWhile(ind => ind < targetIndex).length
    }

    @annotation.tailrec
    def go(n: Int): Unit = {
      if (n == 0) return
      else {
        val indices: Array[Int] = sc.nextLine().split(" ").map(i => i.toInt)
        val beforeNumber: Int = getAcNumberBefore(indices(0) - 1)
        val afterNumber: Int = getAcNumberAfter(indices(1) - 1)
        println(acIndexLength - beforeNumber - afterNumber)
      }
      go(n - 1)
    }

    go(indicesSetNumber)
  }
}
