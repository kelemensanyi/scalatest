/*
 * Copyright 2001-2015 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalatest.prop

import org.scalatest.FunSpec
import org.scalatest.Matchers
import org.scalatest.exceptions.TestFailedException
import org.scalactic.anyvals._

class GenSpec extends FunSpec with Matchers {
  describe("A Gen") {
    it("should produce the same Byte values in the same order given the same Rnd") {
      import Gen._
      val aGen= byteGen
      val bGen = byteGen
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, ar3) = aGen.next(rnd = ar2)
      val (a4, ar4) = aGen.next(rnd = ar3)
      val (a5, ar5) = aGen.next(rnd = ar4)
      val (a6, ar6) = aGen.next(rnd = ar5)
      val (a7, _) = aGen.next(rnd = ar6)
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, br3) = bGen.next(rnd = br2)
      val (b4, br4) = bGen.next(rnd = br3)
      val (b5, br5) = bGen.next(rnd = br4)
      val (b6, br6) = bGen.next(rnd = br5)
      val (b7, _) = bGen.next(rnd = br6)
      List(a1, a2, a3, a4, a5) should contain theSameElementsAs List(b1, b2, b3, b4, b5)
      a6 shouldEqual b6
      a7 shouldEqual b7
    }

    it("should produce the same Short values in the same order given the same Rnd") {
      import Gen._
      val aGen= shortGen
      val bGen = shortGen
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, ar3) = aGen.next(rnd = ar2)
      val (a4, ar4) = aGen.next(rnd = ar3)
      val (a5, ar5) = aGen.next(rnd = ar4)
      val (a6, ar6) = aGen.next(rnd = ar5)
      val (a7, _) = aGen.next(rnd = ar6)
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, br3) = bGen.next(rnd = br2)
      val (b4, br4) = bGen.next(rnd = br3)
      val (b5, br5) = bGen.next(rnd = br4)
      val (b6, br6) = bGen.next(rnd = br5)
      val (b7, _) = bGen.next(rnd = br6)
      List(a1, a2, a3, a4, a5) should contain theSameElementsAs List(b1, b2, b3, b4, b5)
      a6 shouldEqual b6
      a7 shouldEqual b7
    }

    it("should produce the same Char values in the same order given the same Rnd") {
      import Gen._
      val aGen= charGen
      val bGen = charGen
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, ar3) = aGen.next(rnd = ar2)
      val (a4, ar4) = aGen.next(rnd = ar3)
      val (a5, ar5) = aGen.next(rnd = ar4)
      val (a6, ar6) = aGen.next(rnd = ar5)
      val (a7, _) = aGen.next(rnd = ar6)
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, br3) = bGen.next(rnd = br2)
      val (b4, br4) = bGen.next(rnd = br3)
      val (b5, br5) = bGen.next(rnd = br4)
      val (b6, br6) = bGen.next(rnd = br5)
      val (b7, _) = bGen.next(rnd = br6)
      List(a1, a2, a3, a4, a5) should contain theSameElementsAs List(b1, b2, b3, b4, b5)
      a6 shouldEqual b6
      a7 shouldEqual b7
    }

    it("should produce the same Int values in the same order given the same Rnd") {
      import Gen._
      val aGen= intGen
      val bGen = intGen
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, ar3) = aGen.next(rnd = ar2)
      val (a4, ar4) = aGen.next(rnd = ar3)
      val (a5, ar5) = aGen.next(rnd = ar4)
      val (a6, ar6) = aGen.next(rnd = ar5)
      val (a7, _) = aGen.next(rnd = ar6)
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, br3) = bGen.next(rnd = br2)
      val (b4, br4) = bGen.next(rnd = br3)
      val (b5, br5) = bGen.next(rnd = br4)
      val (b6, br6) = bGen.next(rnd = br5)
      val (b7, _) = bGen.next(rnd = br6)
      List(a1, a2, a3, a4, a5) should contain theSameElementsAs List(b1, b2, b3, b4, b5)
      a6 shouldEqual b6
      a7 shouldEqual b7
    }
    it("should produce the same Long values in the same order given the same Rnd") {
      import Gen._
      val aGen= longGen
      val bGen = longGen
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, ar3) = aGen.next(rnd = ar2)
      val (a4, ar4) = aGen.next(rnd = ar3)
      val (a5, ar5) = aGen.next(rnd = ar4)
      val (a6, ar6) = aGen.next(rnd = ar5)
      val (a7, _) = aGen.next(rnd = ar6)
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, br3) = bGen.next(rnd = br2)
      val (b4, br4) = bGen.next(rnd = br3)
      val (b5, br5) = bGen.next(rnd = br4)
      val (b6, br6) = bGen.next(rnd = br5)
      val (b7, _) = bGen.next(rnd = br6)
      List(a1, a2, a3, a4, a5) should contain theSameElementsAs List(b1, b2, b3, b4, b5)
      a6 shouldEqual b6
      a7 shouldEqual b7
    }
    it("should produce the same Float values in the same order given the same Rnd") {
      import Gen._
      val aGen = floatGen
      val bGen = floatGen
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, _) = aGen.next(rnd = ar2)
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, _) = bGen.next(rnd = br2)
      a1 shouldEqual b1
      a2 shouldEqual b2
      a3 shouldEqual b3
    }
    it("should produce the same Double values in the same order given the same Rnd") {
      import Gen._
      val aGen = doubleGen
      val bGen = doubleGen
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, _) = aGen.next(rnd = ar2)
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, _) = bGen.next(rnd = br2)
      a1 shouldEqual b1
      a2 shouldEqual b2
      a3 shouldEqual b3
    }
    it("should produce the same PosInt values in the same order given the same Rnd") {
      import Gen._
      val aGen= posIntGen
      val bGen = posIntGen
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, ar3) = aGen.next(rnd = ar2)
      val (a4, ar4) = aGen.next(rnd = ar3)
      val (a5, ar5) = aGen.next(rnd = ar4)
      val (a6, ar6) = aGen.next(rnd = ar5)
      val (a7, _) = aGen.next(rnd = ar6)
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, br3) = bGen.next(rnd = br2)
      val (b4, br4) = bGen.next(rnd = br3)
      val (b5, br5) = bGen.next(rnd = br4)
      val (b6, br6) = bGen.next(rnd = br5)
      val (b7, _) = bGen.next(rnd = br6)
      List(a1, a2, a3, a4, a5) should contain theSameElementsAs List(b1, b2, b3, b4, b5)
      a6 shouldEqual b6
      a7 shouldEqual b7
    }
    it("should offer a map and flatMap method so I can use it in for expressions like a cowboy") {
      import Gen._
      def pairGen(): Gen[(Int, Double)] =
        // doubleGen().flatMap(d => intGen().map(i => (i, d)))
        for {
          d <- doubleGen
          i <- intGen
        } yield (i, d)
      val aGen = pairGen()
      val bGen = pairGen()
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, _) = aGen.next(rnd = ar2)
      a1._1 should not equal a2._1
      a1._2 should not equal a2._2
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, _) = bGen.next(rnd = br2)
      a1 shouldEqual b1
      a2 shouldEqual b2
      a3 shouldEqual b3
    }
    it("should mix up both i and d when used in a for expression") {
      import Gen._
      def pairGen(): Gen[(Int, Double)] =
        // doubleGen().flatMap(d => intGen().map(i => (i, d)))
        for {
          i <- intGen
          d <- doubleGen
        } yield (i, d)
      val aGen = pairGen()
      val bGen = pairGen()
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, _) = aGen.next(rnd = ar2)
      a1._1 should not equal a2._1
      a1._2 should not equal a2._2
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, _) = bGen.next(rnd = br2)
      a1 shouldEqual b1
      a2 shouldEqual b2
      a3 shouldEqual b3
    }
    it("should be usable in a forAll") {
      import GenDrivenPropertyChecks._
      forAll { (i: Int) => 
        i + i shouldEqual i * 2
      }
      a [TestFailedException] should be thrownBy {
        forAll { (i: Int) => 
          i + i shouldEqual i * 3
        }
      }
    }
    it("should be used at least minSuccessful times in a forAll") {
      import GenDrivenPropertyChecks._
      var count = 0
      forAll { (i: Int) => 
        count += 1
        i + i shouldEqual i * 2
      }
      count shouldEqual generatorDrivenConfig.minSuccessful

      {
        implicit val generatorDrivenConfig = PropertyCheckConfig(minSuccessful = 10)
        count = 0
        forAll { (i: Int) => 
          count += 1
          i + i shouldEqual i * 2
        }
        count shouldEqual generatorDrivenConfig.minSuccessful
      }
    }
    it("should be used at least maxDiscarded times in a forAll") {
      import GenDrivenPropertyChecks._
      var count = 0
      a [TestFailedException] should be thrownBy {
        forAll { (i: Int) => 
          count += 1
          whenever(false) {
            i + i shouldEqual i * 3
          }
        }
      }
      count shouldEqual generatorDrivenConfig.maxDiscarded

      {
        implicit val generatorDrivenConfig = PropertyCheckConfig(maxDiscarded = 10)
        count = 0
        a [TestFailedException] should be thrownBy {
          forAll { (i: Int) => 
            count += 1
            whenever(false) {
              i + i shouldEqual i * 3
            }
          }
        }
        count shouldEqual generatorDrivenConfig.maxDiscarded
      }
    }
    it("should produce Byte edge values first in random order") {
      import Gen._
      val gen = byteGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, ar2) = gen.next(rnd = ar1)
      val (a3, ar3) = gen.next(rnd = ar2)
      val (a4, ar4) = gen.next(rnd = ar3)
      val (a5, _) = gen.next(rnd = ar4)
      val edges = List(a1, a2, a3, a4, a5)
      edges should contain (0)
      edges should contain (1)
      edges should contain (-1)
      edges should contain (Byte.MaxValue)
      edges should contain (Byte.MinValue)
    }
    it("should produce Short edge values first in random order") {
      import Gen._
      val gen = shortGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, ar2) = gen.next(rnd = ar1)
      val (a3, ar3) = gen.next(rnd = ar2)
      val (a4, ar4) = gen.next(rnd = ar3)
      val (a5, _) = gen.next(rnd = ar4)
      val edges = List(a1, a2, a3, a4, a5)
      edges should contain (0)
      edges should contain (1)
      edges should contain (-1)
      edges should contain (Short.MaxValue)
      edges should contain (Short.MinValue)
    }
    it("should produce Char edge values first in random order") {
      import Gen._
      val gen = charGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, _) = gen.next(rnd = ar1)
      val edges = List(a1, a2)
      edges should contain (Char.MinValue)
      edges should contain (Char.MaxValue)
    }
    it("should produce Int edge values first in random order") {
      import Gen._
      val gen = intGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, ar2) = gen.next(rnd = ar1)
      val (a3, ar3) = gen.next(rnd = ar2)
      val (a4, ar4) = gen.next(rnd = ar3)
      val (a5, _) = gen.next(rnd = ar4)
      val edges = List(a1, a2, a3, a4, a5)
      edges should contain (0)
      edges should contain (1)
      edges should contain (-1)
      edges should contain (Int.MaxValue)
      edges should contain (Int.MinValue)
    }
    it("should produce Long edge values first in random order") {
      import Gen._
      val gen = longGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, ar2) = gen.next(rnd = ar1)
      val (a3, ar3) = gen.next(rnd = ar2)
      val (a4, ar4) = gen.next(rnd = ar3)
      val (a5, _) = gen.next(rnd = ar4)
      val edges = List(a1, a2, a3, a4, a5)
      edges should contain (0)
      edges should contain (1)
      edges should contain (-1)
      edges should contain (Long.MaxValue)
      edges should contain (Long.MinValue)
    }
    it("should produce the Float edge value first") {
      import Gen._
      val gen = floatGen
      val (a1, _) = gen.next(rnd = Rnd(100))
      a1 shouldEqual 0.0f
    }
    it("should produce the Double edge value first") {
      import Gen._
      val gen = doubleGen
      val (a1, _) = gen.next(rnd = Rnd(100))
      a1 shouldEqual 0.0
    }
    it("should produce PosInt edge values first in random order") {
      import Gen._
      val gen = posIntGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, _) = gen.next(rnd = ar1)
      val edges = List(a1, a2)
      edges should contain (PosInt(1))
      edges should contain (PosInt.MaxValue)
    }
    it("should produce PosZInt edge values first in random order") {
      import Gen._
      val gen = posZIntGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, ar2) = gen.next(rnd = ar1)
      val (a3, _) = gen.next(rnd = ar2)
      val edges = List(a1, a2, a3)
      edges should contain (PosZInt(0))
      edges should contain (PosZInt(1))
      edges should contain (PosZInt.MaxValue)
    }
    it("should produce PosLong edge values first in random order") {
      import Gen._
      val gen = posLongGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, _) = gen.next(rnd = ar1)
      val edges = List(a1, a2)
      edges should contain (PosLong(1L))
      edges should contain (PosLong.MaxValue)
    }
    it("should produce PosZLong edge values first in random order") {
      import Gen._
      val gen = posZLongGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, ar2) = gen.next(rnd = ar1)
      val (a3, _) = gen.next(rnd = ar2)
      val edges = List(a1, a2, a3)
      edges should contain (PosZLong(0L))
      edges should contain (PosZLong(1L))
      edges should contain (PosZLong.MaxValue)
    }
    it("should produce PosFloat edge values first in random order") {
      import Gen._
      val gen = posFloatGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, _) = gen.next(rnd = ar1)
      val edges = List(a1, a2)
      edges should contain (PosFloat(1.0f))
      edges should contain (PosFloat.MaxValue)
    }
    it("should produce PosZFloat edge values first in random order") {
      import Gen._
      val gen = posZFloatGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, ar2) = gen.next(rnd = ar1)
      val (a3, _) = gen.next(rnd = ar2)
      val edges = List(a1, a2, a3)
      edges should contain (PosZFloat(0.0f))
      edges should contain (PosZFloat(1.0f))
      edges should contain (PosZFloat.MaxValue)
    }
    it("should produce PosDouble edge values first in random order") {
      import Gen._
      val gen = posDoubleGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, _) = gen.next(rnd = ar1)
      val edges = List(a1, a2)
      edges should contain (PosDouble(1.0))
      edges should contain (PosDouble.MaxValue)
    }
    it("should produce PosZDouble edge values first in random order") {
      import Gen._
      val gen = posZDoubleGen
      val (a1, ar1) = gen.next(rnd = Rnd(100))
      val (a2, ar2) = gen.next(rnd = ar1)
      val (a3, _) = gen.next(rnd = ar2)
      val edges = List(a1, a2, a3)
      edges should contain (PosZDouble(0.0))
      edges should contain (PosZDouble(1.0))
      edges should contain (PosZDouble.MaxValue)
    }
    it("should offer a String generator that returns a string whose length equals the passed size") {

      import Gen._
      val gen = stringGen

      val (s1, r1) = gen.next(size = 0, rnd = Rnd(100))
      s1.length shouldBe 0

      val (s2, r2) = gen.next(size = 3, rnd = r1)
      s2.length shouldBe 3

      val (s3, r3) = gen.next(size = 38, rnd = r2)
      s3.length shouldBe 38

      val (s4, r4) = gen.next(size = 88, rnd = r3)
      s4.length shouldBe 88

      val (s5, _) = gen.next(size = 100, rnd = r4)
      s5.length shouldBe 100

      an [IllegalArgumentException] should be thrownBy {
        gen.next(size = -1, rnd = Rnd(100))
      }
    }
    it("should offer a chooseInt method") {
      import Gen._
      import org.scalactic.anyvals._
      def posIntGen: Gen[PosInt] =
        for (i <- Gen.chooseInt(1, Int.MaxValue)) yield PosInt.from(i).get

      val aGen = posIntGen
      val (a1, ar1) = aGen.next(rnd = Rnd(100))
      val (a2, ar2) = aGen.next(rnd = ar1)
      val (a3, ar3) = aGen.next(rnd = ar2)
      val (a4, ar4) = aGen.next(rnd = ar3)
      val (a5, ar5) = aGen.next(rnd = ar4)
      val (a6, ar6) = aGen.next(rnd = ar5)
      val (a7, _) = aGen.next(rnd = ar6)

      val bGen = posIntGen
      val (b1, br1) = bGen.next(rnd = Rnd(100))
      val (b2, br2) = bGen.next(rnd = br1)
      val (b3, br3) = bGen.next(rnd = br2)
      val (b4, br4) = bGen.next(rnd = br3)
      val (b5, br5) = bGen.next(rnd = br4)
      val (b6, br6) = bGen.next(rnd = br5)
      val (b7, _) = bGen.next(rnd = br6)
      a1 shouldEqual b1
      a2 shouldEqual b2
      a3 shouldEqual b3
      a4 shouldEqual b4
      a5 shouldEqual b5
      a6 shouldEqual b6
      a7 shouldEqual b7
    }
    it("on second thought I really want mapping and flatMapping to use the edges") {
      // import prop._
      import Gen._
      def pairGen(): Gen[(Int, Int)] =
        // intGen.flatMap(i => intGen.map(j => (i, j)))
        for {
          i <- intGen
          j <- intGen
        } yield (i, j)
      val gen = pairGen()
      val ((i1, j1), r1) = gen.next(rnd = Rnd(100))
      val ((i2, j2), r2) = gen.next(rnd = r1)
      val ((i3, j3), r3) = gen.next(rnd = r2)
      val ((i4, j4), r4) = gen.next(rnd = r3)
      val ((i5, j5), r5) = gen.next(rnd = r4)
      val ((i6, j6), r6) = gen.next(rnd = r5)
      val ((i7, j7), r7) = gen.next(rnd = r6)
      val ((i8, j8), r8) = gen.next(rnd = r7)
      val ((i9, j9), r9) = gen.next(rnd = r8)
      val ((i10, j10), r10) = gen.next(rnd = r9)
      val values = List(i1, j1, i2, j2, i3, j3)
      values should contain (0)
      values should contain (1)
      values should contain (-1)
      values should contain (Int.MaxValue)
      values should contain (Int.MinValue)
    }
  }
}

