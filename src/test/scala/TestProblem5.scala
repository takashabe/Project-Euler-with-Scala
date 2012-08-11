package pj_euler

import org.specs2.mutable._

object TestProblem5 extends Specification {
  "Problem5" should {
    "1から10までの整数全てで割り切れる数字の最小は2520である" in {
      Problem5.calcMinDividedEach((1 to 10).toList) must_== 2520
    }
    "1から20までの整数全てで割り切れる数字の最小はである" in {
      Problem5.calcMinDividedEach((1 to 20).toList) must_== 232792560
    }
  }
}
