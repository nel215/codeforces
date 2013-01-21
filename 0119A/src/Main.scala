import scala.annotation.tailrec
object Main {

  def main(args: Array[String]): Unit = {
    @tailrec
    def gcd(x:Int,y:Int):Int= y match{
      case 0 => return x;
      case _ => return gcd(y,x%y);
    }
    var fix = readLine().split(" ").map(_.toInt)
    @tailrec
    def rec(t:Int,n:Int):Int= n match{
      case _ if gcd(fix(t),n)>n => return 1-t;
      case _ => return rec(1-t,n-gcd(fix(t),n))
    }
    println(rec(0,fix(2)))
  }

}