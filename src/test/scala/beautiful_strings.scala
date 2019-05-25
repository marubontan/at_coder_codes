import java.util.Scanner

object BeautifulStrings {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val w = sc.next
    println(w.distinct.foldLeft("Yes") {
      (acc, s) => {
        if (acc == "No") acc
        else {
          if (w.count(_ == s) % 2 == 0) "Yes"
          else "No"
        }
      }
    })
  }
}
