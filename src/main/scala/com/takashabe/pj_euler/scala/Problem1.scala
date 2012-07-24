package pj_euler

object Problem1 {
  def sumMultiplesOf2NumsBelow(num1, num2, max):Int = {
    (1 to max) filter (xs => xs%num1==0 || xs%num2==0) sum
  }
}
