package pj_euler

import scala.collection.mutable._

object Problem8 extends App{
  def CalcConsecutive(n: Int, list: List[Int]): List[Long] = list match {
    case Nil => Nil
    case _ if list.length < 5 => Nil
    case _  => (list take n product).toLong :: CalcConsecutive(n, list drop 1)
  }

  def strToIntList(src: String) = {
    var ss: ListBuffer[Int] = ListBuffer()
    src.replaceAll("\n", "").toList.foreach( ss += _  - 48)
    ss.toList
  }

  def findMaxConse(n: Int, src: String) = {
    CalcConsecutive(n, strToIntList(src)).sorted.reverse.head
  }
}
