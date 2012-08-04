package pj_euler

import org.specs2.mutable._

object TestProblem2 extends Specification {
  "Problem2" should {
    "フィボナッチ数列の項の値が8以下である範囲の偶数値の総和" in {
      Problem2.sumFibonacciEven(0, 1, 8) must_== 10
    }

    "フィボナッチ数列の項の値が400万以下である範囲の偶数値の総和" in {
      Problem2.sumFibonacciEven(0, 1, 4000000) must_== 4613732
    }
  }
}
