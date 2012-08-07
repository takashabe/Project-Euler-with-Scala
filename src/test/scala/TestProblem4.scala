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
    "2桁の数の積である回文数の最大値は9009である" in {
      Problem4.calcProductDigitPalindromicNumber(2) must_==9009
    }
  }
}
