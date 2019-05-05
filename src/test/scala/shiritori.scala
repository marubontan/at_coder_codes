import java.util.Scanner
import scala.collection.mutable

object Shiritori {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextInt
    val words = List.fill(n+1)(sc.nextLine).slice(1, n+1)
    val acc: mutable.Set[String] = mutable.Set(words.head)

    val finalJudge: Boolean = words.slice(1, words.length).foldLeft((words.head, acc, true)) {
      case ((word, wordSet, temporarilyJudge), _) if !temporarilyJudge => (word, wordSet, temporarilyJudge)
      case ((word, wordSet, _), nextWord) if (word.last == nextWord.head) && (!wordSet.contains(nextWord)) =>
        wordSet += nextWord
        (nextWord, wordSet, true)
      case ((word, wordSet, _), _) =>
        (word, wordSet, false)
    }._3

    if (finalJudge) println("Yes")
    else println("No")
  }
}
