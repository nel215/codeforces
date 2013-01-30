object Main {

  def main(args: Array[String]): Unit = {
    println((for(i <- 1 to readInt())yield if(readLine().split(' ').map(_.toInt).sum>=2) 1 else 0).sum)
  }

}