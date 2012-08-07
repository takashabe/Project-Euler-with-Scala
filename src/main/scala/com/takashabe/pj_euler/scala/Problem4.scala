package pj_euler

import scala.math._

object Problem4 extends App{
  def numToList(n: Int): List[Int] = {
    n match {
      case 0 => Nil
      case n => n % 10 :: numToList(n / 10)
    }
  }
  def isPalindromicNumber(n: Int): Boolean = {
    val ns = numToList(n)
    ns == ns.reverse
  }
  def calcProductDigitPalindromicNumber(n: Int): Int = {
    val p = List.make(n, 9).mkString.toInt
    for(i <- p to p/2) {
      if(i % 2 == 0)
        isPalindromicNumber(i * i+1)
      else
        isPalindromicNumber(i * i)
    }
  }
}
