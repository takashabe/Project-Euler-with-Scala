package pj_euler

import scala.math._

object Problem6 extends App{
  def sumPow(ns: List[Int]): Int = {
    pow(ns.sum, 2).toInt
  }

  def powSum(ns: List[Int]): Int = {
    ns.map(pow(_, 2)).sum.toInt
  }
}
