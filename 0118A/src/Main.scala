object Main {

  def main(args: Array[String]): Unit = {
    println(readLine().map(_.toUpperCase).filter(!"AOYEUI".contains(_)).map("."+_.toLowerCase).reduce(_+_))
  }

}