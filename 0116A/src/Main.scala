object Main {

  def main(args: Array[String]): Unit = {
    val n = readInt()
    var sum = 0
    var res = 0
    for(i <- 1 to n){
      val Array(a,b) = readLine().split(" ").map(_.toInt)
      sum += b-a
      res = Math.max(res,sum)
    }
    println(res)
  }

}