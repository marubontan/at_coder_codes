import java.util.Scanner

object AtCoderBeginnerContest999 {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    println(sc.nextLine.map {
      case '1' => '9'
      case '9' => '1'
    })
  }
}
