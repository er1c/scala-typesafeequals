/*
 * Copyright (c) 2019 Frugal Mechanic (http://frugalmechanic.com)
 * Copyright (c) 2020 the Type Safe Equals contributors.
 * See the project homepage at: https://er1c.github.io/scala-typesafeequals/
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

package typesafeequals

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class TestTypeSafeEquals extends AnyFunSuite with Matchers {
  val nonNullString: String = "foo"
  val nullString: String = null

  test("===") {
    nonNullString ≡ "foo" shouldBe true
    nonNullString ≡ "bar" shouldBe false
  }

  test("=!=") {
    nonNullString ≠ "foo" shouldBe false
    nonNullString ≠ "bar" shouldBe true
  }
}
