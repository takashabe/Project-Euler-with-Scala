package pj_euler

import org.specs2.mutable._

object TestProblem1 extends Specification {
  "Problem1" should {
    "1000未満の3か5の倍数になっている数字の合計" in {
      Problem1.sumMultiplesOf2NumsBelow(3, 5, 1000) must_== 234168
    }
  }
}
