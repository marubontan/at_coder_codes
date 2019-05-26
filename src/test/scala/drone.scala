import java.util.Scanner

object Drone {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val s = sc.nextLine
    val t = sc.nextInt
    val (directions, lacks) = s.partition(_.toString != "?")

    val xCoordinate = directions.count(_.toString == "R") - directions.count(_.toString == "L")
    val yCoordinate = directions.count(_.toString == "U") - directions.count(_.toString == "D")

    val finalCoordinateDistance = math.abs(xCoordinate) + math.abs(yCoordinate)
    if (t == 1) println(finalCoordinateDistance + lacks.length)
    else{
      if ((finalCoordinateDistance - lacks.length) >= 0) println(finalCoordinateDistance - lacks.length)
      else{
        println((lacks.length - finalCoordinateDistance) % 2)
      }
    }
  }
}
