object Main {

  def main(args: Array[String]): Unit = {
    val a = readLine().toLowerCase()
    val b = readLine().toLowerCase()
    println(if(a<b)-1 else if(a==b)0 else 1)
  }

}