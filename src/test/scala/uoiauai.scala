import java.util.Scanner

object Uoiauai {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val vowel = Array("a", "i", "u", "e", "o")
    if (vowel.contains(sc.nextLine)) println("vowel")
    else println("consonant")
  }
}
