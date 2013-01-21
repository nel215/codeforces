object Main {

  def main(args: Array[String]): Unit = {
    def rec(x:Int,n:Int):Int={
      if(n<Math.pow(2,x).toInt*5){
        return n/Math.pow(2,x).toInt
      }else{
        return rec(x+1,n-Math.pow(2,x).toInt*5)
      }
  	}
    println(List("Sheldon", "Leonard", "Penny", "Rajesh", "Howard")(rec(0,readInt()-1)))
  }

}