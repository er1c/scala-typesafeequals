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

trait Implicits {

  /** Macro-based `===` and `=!=` equals variants that prevent fruitless "foo" === 0 comparisons */
  implicit def toTypeSafeEquals[L](left: L): TypeSafeEquals[L] = new TypeSafeEquals(left)

  /** Macro-based .isNull, .isNotNull, .nonNull */
  implicit def toAnyRefNullChecks[A <: AnyRef](ref: A): AnyRefNullChecks[A] = new AnyRefNullChecks[A](ref)
}
