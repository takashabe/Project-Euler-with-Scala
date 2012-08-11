package pj_euler

import scala.math._

object Problem5 extends App{
  def isDividedEach(p: Int, ns: List[Int]): Boolean = {
    ns.foreach( { i =>
      if(p % i != 0) return false
    })
    return true
  }

  def calcMinDividedEach(ns: List[Int]): Int = {
    Stream.from(ns.last).foreach( { i =>
      if(isDividedEach(i, ns)) return i
    })
    return -1
  }
}
