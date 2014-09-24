import scala.annotation.tailrec
import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val Array(n,t) = StdIn.readLine().split(' ').map(_.toInt)

    @tailrec
    def rec(i:Int, queue:String): String = {
      if(i == 0)queue
      else rec(i-1, queue.replace("BG", "GB"))
    }
    val ans = rec(t,StdIn.readLine())
    println(ans)
  }
}
