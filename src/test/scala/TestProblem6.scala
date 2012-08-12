package pj_euler

import org.specs2.mutable._

object TestProblem6 extends Specification {
  "Problem6" should {
    "1から10の自然数の和の二乗は385である" in {
      Problem6.powSum((1 to 10).toList) must_== 385
    }

    "1から10の二乗数の和は3025である" in {
      Problem6.sumPow((1 to 10).toList) must_== 3025
    }

    "1から10の自然数の和の二乗と、二乗数の和の差は2640である" in {
      val x = Problem6.sumPow((1 to 10).toList)
      val y = Problem6.powSum((1 to 10).toList)
      x - y must_== 2640
    }

    "1から100の自然数の和の二乗と、二乗数の和の差は25164150である" in {
      val x = Problem6.sumPow((1 to 100).toList)
      val y = Problem6.powSum((1 to 100).toList)
      x - y must_== 25164150
    }
  }
}
