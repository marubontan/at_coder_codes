import java.util.Scanner

object EnergyDrinkCollector {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, m) = sc.nextLine.split(" ").map(_.toInt)
    val sortedInput = List.fill(n, 2)(sc.nextLong).sortBy(_.head)

    println(sortedInput.foldLeft((0L, m.toLong)){
      case ((acc, mTemp), _) if mTemp == 0 => (acc, 0)
      case ((acc, mTemp), item) => {
        val numberOfBuying = Math.min(mTemp, item.last)
        (acc + item.head * numberOfBuying, mTemp - numberOfBuying)
      }
    }._1)
  }

}
