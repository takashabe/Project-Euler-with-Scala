package pj_euler

object Problem1 extends App{
  def sumMultiplesOf2NumsBelow(num1: Int, num2: Int, max: Int):Int = {
    (1 to max) filter (xs => xs%num1==0 || xs%num2==0) sum
  }
}