import java.util.Scanner

object SomethingOnIt {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val toppings: String = sc.nextLine

    println(700 + 100 * toppings.count(_ == 'o'))
  }

}
