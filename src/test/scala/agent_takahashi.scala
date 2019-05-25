import java.util.Scanner

object AgentTakahashi {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    println(math.sqrt(math.sqrt(sc.next.toInt)).toInt)
  }
}
