import java.util.Scanner

object ChristmasEveEve {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val n: Int = sc.nextInt
    val prices = List.fill(n)(sc.nextInt).sorted.reverse

    println(prices.head / 2 + prices.slice(1, prices.length).sum)
  }

}
