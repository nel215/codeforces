import scala.collection.mutable.Queue
object Main {

  def main(args: Array[String]): Unit = {
    val n = readInt()
    val arr = (0 until 2*n+1).foldLeft(List[Array[Char]]())((l,i)=>(" "*(2*n+1-Math.abs(i-n))).toCharArray()+:l).toArray
    val que= Queue((n,n,n))
    while(!que.isEmpty){
      val (x,y,v) = que.dequeue
      if(v>=0 && arr(y)(x)==' '){
        arr(y)(x) = (""+v)(0)
        List((0,1),(1,0),(0,-1),(-1,0)).map(dir=>que.enqueue((x+dir._1,y+dir._2,v-1)))
      }
    }
    arr.map(x=>println(x.mkString(" ")))
  }

}