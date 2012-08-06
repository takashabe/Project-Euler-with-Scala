package pj_euler

import org.specs2.mutable._

object TestProblem3 extends Specification {
  "Problem3" should {
    "13195の素因数は5, 7, 13, 29である" in {
      Problem3.calcFactor(13195l) must_== List(5, 7, 13, 29)
    }
    "13195の素因数の最大値は29である" in {
      Problem3.calcFactor(13195l).last must_== 29
    }

    "600851475143の素因数は71, 839, 1471, 6857である" in {
      Problem3.calcFactor(600851475143l) must_== List(71, 839, 1471, 6857)
    }
    "600851475143の素因数はの最大値は6857である" in {
      Problem3.calcFactor(600851475143l).last must_== 6857
    }
  }
}
