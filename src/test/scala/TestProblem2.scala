package pj_euler

import org.specs2.mutable._

object TestProblem2 extends Specification {
  "Problem2" should {
    "フィボナッチ数列の8以下の項の合計" in {
      Problem2.sumFibonacciEven(8) must_== 9
    }
  }
}
