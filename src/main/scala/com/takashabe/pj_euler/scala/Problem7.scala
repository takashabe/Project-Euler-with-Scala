package pj_euler

import scala.math._
import scala.collection.mutable.ListBuffer

object Problem7 extends App{
  def isPrime(n: Int): Boolean = {
    n match {
      case n if (n < 1) => false
      case _ => List.range(2, n).exists(n % _ == 0) == false
    }
  }

  def findPrime(p: Int): Int = {
    var primeCnt = 1
    var i = 3
    while(primeCnt < p) {
      if(isPrime(i)) primeCnt += 1
      i += 2
    }
    i - 2
  }
}
