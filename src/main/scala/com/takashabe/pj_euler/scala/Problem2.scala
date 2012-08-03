package pj_euler

object Problem2 extends App{
  def sumFibonacciEven(n: Int): Int = {
    var list = List(1, 0)
    for(i <- 1 to n) {
      val tmp = list.head + list.tail.head
      if(tmp < n)
        list = tmp :: list
    }
    println(list)
    list sum
  }
}
