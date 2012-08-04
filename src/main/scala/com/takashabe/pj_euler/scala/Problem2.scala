package pj_euler

object Problem2 extends App{
  def sumFibonacciEven(n1: Int, n2: Int, max: Int): Int = {
    fibList(n1, n2, max) filter(_ % 2 == 0) sum
  }

  def fibList(n1: Int, n2:Int, max:Int): List[Int] = {
    val n = n1 + n2
    n match {
      case n if n > max => Nil
      case _           => n :: fibList(n2, n, max)
    }
  }
}
