import java.util.Scanner

object ChokuLanguage {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val word = sc.nextLine
    if (word.split("").distinct.toSet.diff(Set("c", "h", "o", "k", "u")).isEmpty) {
      if (word.split("ch").flatMap(_.split("")).distinct.toSet.intersect(Set("c", "h")).isEmpty) println("YES")
      else println("NO")
    } else println("NO")
  }
}
