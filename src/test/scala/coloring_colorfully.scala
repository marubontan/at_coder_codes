import java.util.Scanner

object ColoringColorfully {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val tiles: String = sc.nextLine()
    val firstTile: Char = tiles(0) match{
      case '0' => '1'
      case '1' => '0'
    }

    val changeTileNumber: Int = tiles.foldLeft((firstTile, 0)) {
      case ((prevTile: Char, changeNumber: Int), presentTile) => {
        if (prevTile == presentTile) {
          val updatedTile: Char = presentTile match {
            case '0' => '1'
            case '1' => '0'
          }
          (updatedTile, changeNumber + 1)
        } else {
          (presentTile, changeNumber)
        }
      }
    }._2

    println(changeTileNumber)
  }
}


