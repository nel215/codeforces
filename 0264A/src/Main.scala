import scala.annotation.tailrec
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.io.PrintWriter
object Main {

  def main(args: Array[String]): Unit = {
    val br = new BufferedReader(new InputStreamReader(System.in))
    val pw = new PrintWriter(System.out)
    val inp = br.readLine()
    var res = new Array[Int](inp.length())
    @tailrec
    def rec(ind:Int,seq:List[Char],left:Int,right:Int):Unit={
      if(!seq.isEmpty)seq.head match{
      	case 'l' => {res(right) = ind;rec(ind+1,seq.tail,left,right-1)}
      	case 'r' => {res(left)  = ind;rec(ind+1,seq.tail,left+1,right)}
      }
    }
    rec(1,inp.toList,0,inp.length()-1)
    res.map(pw.println(_))
    pw.flush()
  }

}