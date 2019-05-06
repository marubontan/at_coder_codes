import java.util.Scanner

object EatingSymbolsEasy {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val symbolString: String = sc.nextLine()

    println(symbolString.foldLeft(0) {
      case (acc, sym) if sym == '+' => acc + 1
      case (acc, _) => acc - 1
    })
  }

}
