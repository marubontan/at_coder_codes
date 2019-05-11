import java.util.Scanner

object AbcOfAbc {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val abc: Array[String] = sc.nextLine.split("")
    if (abc.contains("a") & abc.contains("b") & abc.contains("c")) println("Yes")
    else println("No")
  }

}
