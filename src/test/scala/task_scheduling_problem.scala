import java.util.Scanner

object TaskSchedulingProblem {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val nums = sc.nextLine.split(" ").map(_.toInt)

    val costA = Math.abs(nums.head - nums(1))
    val costB = Math.abs(nums.head - nums.last)
    val costC = Math.abs(nums(1) - nums.last)
    println(Array(costA, costB, costC).sorted.slice(0, 2).sum)
  }

}
