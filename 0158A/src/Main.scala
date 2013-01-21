object Main {

  def main(args: Array[String]): Unit = {
    val Array(n,k) = readLine().split(" ").map(_.toInt)
    val place = readLine().split(" ").map(_.toInt)
    println(place.count(x => x>0 && x>=place(k-1)))
  }

}