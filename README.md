# scala-typesafeequals

[![Build](https://github.com/er1c/scala-typesafeequals/workflows/Continuous%20Integration/badge.svg?branch=main)](https://github.com/er1c/scala-typesafeequals/actions?query=branch%3Amain+workflow%3A%22Continuous+Integration%22) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.er1c/scala-typesafeequals_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.er1c/scala-typesafeequals_2.13)

## Macro based typesafe ===, =!=, isNull, isNotNull, nonNull

The macros provide a compile time check to ensure you never try to compare unrelated types. (e.g. `0 == ""`).  The macros generate the original `(a == b)` to avoid any extra boxing or allocations.

Similar `.isNull`, `.isNotNull`, and `.nonNull` helpers are provided to avoid using `foo == null`.

## Documentation

Links:

- [Website](https://er1c.github.io/scala-typesafeequals/)
- [API documentation](https://er1c.github.io/scala-typesafeequals/api/)

### Usage

Add this to your `build.sbt`:

```scala
libraryDependencies += "io.github.er1c" %% "scala-typesafeequals" % "<version>"
```

Cross-builds are available for Scala 2.11.12, 2.12.11 and 2.13.3.

Find out more in the [microsite](https://er1c.github.io/scala-typesafeequals).

#### Implicits

[Implicits.scala](core/shared/src/main/scala/typesafeequals/Implicits.scala) is provided to extend in your own implicits object.

To import all implicits:

```scala
import typesafeequals._
```

For selective imports:

```scala
import typesafeequals.TypeSafeEquals._
import typesafeequals.AnyRefNullChecks._
```

#### TypeSafeEquals

```scala
import typesafeequals._

val a = "foo"
val b = "bar"
val i = 0

a === a // true
a === b // false
a =!= b // true
a =!= a // false
a === i // won't compile
a =!= i // won't compile
```

#### AnyRefNullChecks

```scala
import typesafeequals._

val a = "foo"
val b = null

a.isNull // false
b.isNull // true

a.isNotNull // true
b.isNotNull // false

a.nonNull // true
b.nonNull // false
```

## Contributing

The Type Safe Equals project welcomes contributions from anybody wishing to participate.  All code or documentation that is provided must be licensed with the same license that Type Safe Equals is licensed with (Apache 2.0, see [LICENCE](./LICENSE.md)).

People are expected to follow the [Scala Code of Conduct](./CODE_OF_CONDUCT.md) when discussing Type Safe Equals on GitHub, Gitter channel, or other venues.

Feel free to open an issue if you notice a bug, have an idea for a feature, or have a question about the code. Pull requests are also gladly accepted. For more information, check out the [contributor guide](./CONTRIBUTING.md).

## License

All code in this repository is licensed under the Apache License, Version 2.0.  See [LICENCE](./LICENSE.md).
