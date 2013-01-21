object Main {
  def main(args: Array[String]): Unit = {
    val seq = readLine()
	if(seq.tail.equals(seq.tail.map(_.toUpperCase))){
	  def f(s:List[Char]):List[Char] = {
	    if(s.head.isLower)return s.head.toUpperCase+:s.tail.map(_.toLowerCase)
	    return s.map(_.toLowerCase)
	  }
	  println(f(seq.toList).mkString)
	}
	else println(seq)
  }

}