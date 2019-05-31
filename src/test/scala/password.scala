import java.util.Scanner

object Password {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val o = scala.collection.mutable.Queue(sc.nextLine.split(""): _*)
    val e = scala.collection.mutable.Queue(sc.nextLine.split(""): _*)

    var s: String = ""
    while (o.nonEmpty) {
      s += o.dequeue
      if (e.nonEmpty) s += e.dequeue
    }
    println(s)
  }
}
