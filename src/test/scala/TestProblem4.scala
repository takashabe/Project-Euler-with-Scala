package pj_euler

import org.specs2.mutable._

object TestProblem4 extends Specification {
  "Problem4" should {
    "123を1桁ずつListに分割するとList(1, 2, 3)である" in {
      Problem4.numToList(123).reverse must_==List(1, 2, 3)
    }
    "2を1桁ずつListに分割するとList(2)である" in {
      Problem4.numToList(2).reverse must_==List(2)
    }
    "101は回文数である" in {
      Problem4.isPalindromicNumber(101) must_==true
    }
    "80295は回文数ではない" in {
      Problem4.isPalindromicNumber(80295) must_==false
    }
    "4桁の最大数は9999である" in {
      Problem4.numMaxDigit(4) must_==9999
    }
    "2桁の数の積で表される回文数のうち、最大のものは9009である" in {
      Problem4.calcMaxProductPalindrome(Problem4.numMaxDigit(2)) must_==9009
    }
    "3桁の数の積で表される回文数のうち、最大のものはhogeである" in {
      Problem4.calcMaxProductPalindrome(Problem4.numMaxDigit(3)) must_==906609
    }
  }
}
