package pj_euler

import org.specs2.mutable._

object TestProblem7 extends Specification {
  "Problem7" should {
    "昇順で6つ目の素数は13である" in {
      Problem7.findPrime(6) must_== 13
    }

    "昇順で10001つ目の素数は104743である" in {
      Problem7.findPrime(10001) must_== 104743
    }
  }
}
