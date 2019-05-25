import java.util.Scanner

object Rectanglular {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val nums = sc.nextLine.split(" ").map(math.BigInt(_))
    println(nums.foldLeft(math.BigInt(1)){
      (acc, i) => acc * i % (1000000000 + 7)
    })
  }
}
