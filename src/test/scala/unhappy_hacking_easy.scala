import java.util.Scanner

object UnhappyHackingEasy {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val s = sc.next
    val shownStrings = scala.collection.mutable.Stack[String]()
    s.foreach(w => if (w.toString == "B"){
      if (shownStrings.nonEmpty) shownStrings.pop()
    }
    else shownStrings.push(w.toString))
    println(shownStrings.mkString.reverse)
  }
}
