package pj_euler

import scala.math._

object Problem3 extends App{
  def calcFactor(n:Long, p:Long=2): List[Long] = {
    n match {
      case _ if(p > sqrt(n)) => List(n)
      case _ if(n % p == 0) => p :: calcFactor(n/p, p)
      case _ => calcFactor(n, p + 1)
    }
  }
}
