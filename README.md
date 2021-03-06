# UtilKt

A kotlin library, which contains some utility functionalities.

> :warning: **It's not meant be a real library:**
> It's more like a test / example library to play around with publishing artifacts using Gradle.

## Usage

### Roman Numerals

The Roman numerals utils only support numbers in range of 1 to 3,999.

#### Converting an integer to a Roman numerals string

```kotlin
// kotlin
import com.github.lagiilein.utilkt.RomanNumerals

fun func() {
    RomanNumerals.convertToRoman(5) // returns: V
}
```

### List Util

#### Comparing the contents of two Integer Lists based on Scores

```kotlin
// kotlin
import com.github.lagiilein.utilkt.ListUtil

fun func() {
    ListUtil.compareIntListContentBasedOnScores(listOf(1, 2, 3, 4), listOf(3, 2, 1, 0)) // returns: [2, 1]
}
```

```kotlin
// kotlin (using extension function on List<Int>)
import com.github.lagiilein.utilkt.compareContentBasedOnScores

fun func() {
    listOf(1, 2, 3, 4).compareContentBasedOnScores(listOf(1, 2, 1, 0)) // returns: [2, 1]
}
```

### Numbers

#### IsInRangeInclusive

```java
// java

import com.github.lagiilein.utilkt.number.IsInRangeInclusiveKt;

public class App {
    public static void main() {
        IsInRangeInclusiveKt.isInRangeInclusive(0, -1, 1);
    }
}
```

```kotlin
// kotlin

import com.github.lagiilein.utilkt.number.isInRangeInclusive

fun main() {
    50.isInRangeInclusive(-5, 50) // true
    50.01.isInRangeInclusive((-5).toDouble(), 50.toDouble()) // false
}
```

## License

Distributed under the MIT License. See [LICENSE](/LICENSE) for more information.
