import java.util.Scanner

object FiveAntennas {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)

    val a: Int = sc.nextLine().toInt
    sc.nextLine().toInt
    sc.nextLine().toInt
    sc.nextLine().toInt
    val e: Int = sc.nextLine().toInt
    val diff: Int = sc.nextLine().toInt

    if ((e - a) > diff) {
      println(":(")
    } else {
      println("Yay!")
    }
  }

}