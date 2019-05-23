import java.util.Scanner

object ContestWithDrinksEasy {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    sc.nextLine()
    val ts = sc.nextLine.split(" ").map(_.toInt)
    val m = sc.nextLine.toInt
    val drinks = List.fill(m)(sc.nextLine.split(" ").map(_.toInt))
    drinks.map{d => ts.sum + (d(1) - ts(d(0) - 1))}.foreach(println)
  }
}
