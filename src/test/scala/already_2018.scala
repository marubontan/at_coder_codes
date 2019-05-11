import java.util.Scanner

object Already2018 {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    println(sc.nextLine.split("/").map {
      case n if n == "2017" => "2018"
      case n => n
    }.mkString("/"))
  }
}
