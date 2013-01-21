import scala.annotation.tailrec
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.io.PrintWriter
object Main {

  def main(args: Array[String]): Unit = {
    @tailrec
    def rec(ind:Int,seq:List[Char],left:List[Int],right:List[Int]):List[Int]=seq match{
      case List() => return left.reverse++right
      case _ if(seq.head=='l') => return rec(ind+1,seq.tail,left,ind+:right)
      case _ => return rec(ind+1,seq.tail,ind+:left,right)
    }
    val br = new BufferedReader(new InputStreamReader(System.in))
    val pw = new PrintWriter(new OutputStreamWriter(System.out))
    rec(1,br.readLine().toList,List(),List()).map(pw.println(_))
  }

}