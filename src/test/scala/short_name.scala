import java.util.Scanner

object ShortName {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val letters = sc.nextLine.split("").sorted
    val n = sc.nextLine.toInt

    val combinations = for(i<-letters; j<-letters) yield i.toString + j.toString
    println(combinations.apply(n-1))
  }
}
