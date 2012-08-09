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

  def numMaxDigit(n: Int): Int = List.make(n, 9).mkString.toInt

  def calcMaxProductPalindrome(n: Int): Int = {
    var ps: List[Int] = Nil
    for(i <- n/10 to n; j <- n/10 to n) {
      val prod = i * j
      if(isPalindromicNumber(prod)) ps ::= prod
    }
    ps.max
  }
}
