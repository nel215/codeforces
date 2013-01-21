import java.io.BufferedReader
import java.io.InputStreamReader
import scala.annotation.tailrec
object Main {

  def main(args: Array[String]): Unit = {
	val br = new BufferedReader(new InputStreamReader(System.in))
	val n = br.readLine().toInt
	val a = br.readLine().split(" ").map(_.toInt)
	
	def divider(number:Int):List[Int]={
	  var res = List[Int]()
	  @tailrec
	  def rec(i:Int,d:Int):Unit={
		  if(i*i<=d){	  
			if(d%i==0)res = i::d/i::res
			rec(i+1,d)
		  }
	  }
	  rec(2,number)
	  return res
	}
	
	var dp = new Array[Int](100001)
	for(i <- a){
	  dp(i) = 1
	  val div = divider(i)
	  var max = 1
	  div.foreach(x => max = Math.max(max,1+dp(x)))
	  dp(i) = max
	  div.foreach(x => dp(x) = Math.max(dp(x),max))
	}
	println(dp.reduce(Math.max(_,_)))
  }

}