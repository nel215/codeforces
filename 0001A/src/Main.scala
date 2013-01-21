object Main {

  def main(args: Array[String]): Unit = {
    val Array(n,m,a) = readLine().split(" ").map(_.toLong)
    val res = (n/a + (if(n%a!=0) 1 else 0))*(m/a+(if(m%a!=0) 1 else 0))
    println(res)
  }

}