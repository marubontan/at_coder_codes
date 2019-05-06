import java.util.Scanner

object AtcoderCrackers {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(n, k) = sc.nextLine.split(" ").map(_.toInt)
    if (n % k ==0) println(0)
    else println(1)
  }

}
