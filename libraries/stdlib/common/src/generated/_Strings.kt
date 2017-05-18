@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("StringsKt")

package kotlin.text

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.comparisons.*

/**
 * Returns a character at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this char sequence.
 */
@kotlin.internal.InlineOnly
public header inline fun CharSequence.elementAt(index: Int): Char

/**
 * Returns a character at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this char sequence.
 */
@kotlin.internal.InlineOnly
public header inline fun CharSequence.elementAtOrElse(index: Int, defaultValue: (Int) -> Char): Char

/**
 * Returns a character at the given [index] or `null` if the [index] is out of bounds of this char sequence.
 */
@kotlin.internal.InlineOnly
public header inline fun CharSequence.elementAtOrNull(index: Int): Char?

/**
 * Returns the first character matching the given [predicate], or `null` if no such character was found.
 */
@kotlin.internal.InlineOnly
public header inline fun CharSequence.find(predicate: (Char) -> Boolean): Char?

/**
 * Returns the last character matching the given [predicate], or `null` if no such character was found.
 */
@kotlin.internal.InlineOnly
public header inline fun CharSequence.findLast(predicate: (Char) -> Boolean): Char?

/**
 * Returns first character.
 * @throws [NoSuchElementException] if the char sequence is empty.
 */
public header fun CharSequence.first(): Char

/**
 * Returns the first character matching the given [predicate].
 * @throws [NoSuchElementException] if no such character is found.
 */
public header inline fun CharSequence.first(predicate: (Char) -> Boolean): Char

/**
 * Returns the first character, or `null` if the char sequence is empty.
 */
public header fun CharSequence.firstOrNull(): Char?

/**
 * Returns the first character matching the given [predicate], or `null` if character was not found.
 */
public header inline fun CharSequence.firstOrNull(predicate: (Char) -> Boolean): Char?

/**
 * Returns a character at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this char sequence.
 */
@kotlin.internal.InlineOnly
public header inline fun CharSequence.getOrElse(index: Int, defaultValue: (Int) -> Char): Char

/**
 * Returns a character at the given [index] or `null` if the [index] is out of bounds of this char sequence.
 */
public header fun CharSequence.getOrNull(index: Int): Char?

/**
 * Returns index of the first character matching the given [predicate], or -1 if the char sequence does not contain such character.
 */
public header inline fun CharSequence.indexOfFirst(predicate: (Char) -> Boolean): Int

/**
 * Returns index of the last character matching the given [predicate], or -1 if the char sequence does not contain such character.
 */
public header inline fun CharSequence.indexOfLast(predicate: (Char) -> Boolean): Int

/**
 * Returns the last character.
 * @throws [NoSuchElementException] if the char sequence is empty.
 */
public header fun CharSequence.last(): Char

/**
 * Returns the last character matching the given [predicate].
 * @throws [NoSuchElementException] if no such character is found.
 */
public header inline fun CharSequence.last(predicate: (Char) -> Boolean): Char

/**
 * Returns the last character, or `null` if the char sequence is empty.
 */
public header fun CharSequence.lastOrNull(): Char?

/**
 * Returns the last character matching the given [predicate], or `null` if no such character was found.
 */
public header inline fun CharSequence.lastOrNull(predicate: (Char) -> Boolean): Char?

/**
 * Returns the single character, or throws an exception if the char sequence is empty or has more than one character.
 */
public header fun CharSequence.single(): Char

/**
 * Returns the single character matching the given [predicate], or throws exception if there is no or more than one matching character.
 */
public header inline fun CharSequence.single(predicate: (Char) -> Boolean): Char

/**
 * Returns single character, or `null` if the char sequence is empty or has more than one character.
 */
public header fun CharSequence.singleOrNull(): Char?

/**
 * Returns the single character matching the given [predicate], or `null` if character was not found or more than one character was found.
 */
public header inline fun CharSequence.singleOrNull(predicate: (Char) -> Boolean): Char?

/**
 * Returns a subsequence of this char sequence with the first [n] characters removed.
 */
public header fun CharSequence.drop(n: Int): CharSequence

/**
 * Returns a string with the first [n] characters removed.
 */
public header fun String.drop(n: Int): String

/**
 * Returns a subsequence of this char sequence with the last [n] characters removed.
 */
public header fun CharSequence.dropLast(n: Int): CharSequence

/**
 * Returns a string with the last [n] characters removed.
 */
public header fun String.dropLast(n: Int): String

/**
 * Returns a subsequence of this char sequence containing all characters except last characters that satisfy the given [predicate].
 */
public header inline fun CharSequence.dropLastWhile(predicate: (Char) -> Boolean): CharSequence

/**
 * Returns a string containing all characters except last characters that satisfy the given [predicate].
 */
public header inline fun String.dropLastWhile(predicate: (Char) -> Boolean): String

/**
 * Returns a subsequence of this char sequence containing all characters except first characters that satisfy the given [predicate].
 */
public header inline fun CharSequence.dropWhile(predicate: (Char) -> Boolean): CharSequence

/**
 * Returns a string containing all characters except first characters that satisfy the given [predicate].
 */
public header inline fun String.dropWhile(predicate: (Char) -> Boolean): String

/**
 * Returns a char sequence containing only those characters from the original char sequence that match the given [predicate].
 */
public header inline fun CharSequence.filter(predicate: (Char) -> Boolean): CharSequence

/**
 * Returns a string containing only those characters from the original string that match the given [predicate].
 */
public header inline fun String.filter(predicate: (Char) -> Boolean): String

/**
 * Returns a char sequence containing only those characters from the original char sequence that match the given [predicate].
 * @param [predicate] function that takes the index of a character and the character itself
 * and returns the result of predicate evaluation on the character.
 */
public header inline fun CharSequence.filterIndexed(predicate: (index: Int, Char) -> Boolean): CharSequence

/**
 * Returns a string containing only those characters from the original string that match the given [predicate].
 * @param [predicate] function that takes the index of a character and the character itself
 * and returns the result of predicate evaluation on the character.
 */
public header inline fun String.filterIndexed(predicate: (index: Int, Char) -> Boolean): String

/**
 * Appends all characters matching the given [predicate] to the given [destination].
 * @param [predicate] function that takes the index of a character and the character itself
 * and returns the result of predicate evaluation on the character.
 */
public header inline fun <C : Appendable> CharSequence.filterIndexedTo(destination: C, predicate: (index: Int, Char) -> Boolean): C

/**
 * Returns a char sequence containing only those characters from the original char sequence that do not match the given [predicate].
 */
public header inline fun CharSequence.filterNot(predicate: (Char) -> Boolean): CharSequence

/**
 * Returns a string containing only those characters from the original string that do not match the given [predicate].
 */
public header inline fun String.filterNot(predicate: (Char) -> Boolean): String

/**
 * Appends all characters not matching the given [predicate] to the given [destination].
 */
public header inline fun <C : Appendable> CharSequence.filterNotTo(destination: C, predicate: (Char) -> Boolean): C

/**
 * Appends all characters matching the given [predicate] to the given [destination].
 */
public header inline fun <C : Appendable> CharSequence.filterTo(destination: C, predicate: (Char) -> Boolean): C

/**
 * Returns a char sequence containing characters of the original char sequence at the specified range of [indices].
 */
public header fun CharSequence.slice(indices: IntRange): CharSequence

/**
 * Returns a string containing characters of the original string at the specified range of [indices].
 */
public header fun String.slice(indices: IntRange): String

/**
 * Returns a char sequence containing characters of the original char sequence at specified [indices].
 */
public header fun CharSequence.slice(indices: Iterable<Int>): CharSequence

/**
 * Returns a string containing characters of the original string at specified [indices].
 */
@kotlin.internal.InlineOnly
public header inline fun String.slice(indices: Iterable<Int>): String

/**
 * Returns a subsequence of this char sequence containing the first [n] characters from this char sequence, or the entire char sequence if this char sequence is shorter.
 */
public header fun CharSequence.take(n: Int): CharSequence

/**
 * Returns a string containing the first [n] characters from this string, or the entire string if this string is shorter.
 */
public header fun String.take(n: Int): String

/**
 * Returns a subsequence of this char sequence containing the last [n] characters from this char sequence, or the entire char sequence if this char sequence is shorter.
 */
public header fun CharSequence.takeLast(n: Int): CharSequence

/**
 * Returns a string containing the last [n] characters from this string, or the entire string if this string is shorter.
 */
public header fun String.takeLast(n: Int): String

/**
 * Returns a subsequence of this char sequence containing last characters that satisfy the given [predicate].
 */
public header inline fun CharSequence.takeLastWhile(predicate: (Char) -> Boolean): CharSequence

/**
 * Returns a string containing last characters that satisfy the given [predicate].
 */
public header inline fun String.takeLastWhile(predicate: (Char) -> Boolean): String

/**
 * Returns a subsequence of this char sequence containing the first characters that satisfy the given [predicate].
 */
public header inline fun CharSequence.takeWhile(predicate: (Char) -> Boolean): CharSequence

/**
 * Returns a string containing the first characters that satisfy the given [predicate].
 */
public header inline fun String.takeWhile(predicate: (Char) -> Boolean): String

/**
 * Returns a char sequence with characters in reversed order.
 */
public header fun CharSequence.reversed(): CharSequence

/**
 * Returns a string with characters in reversed order.
 */
@kotlin.internal.InlineOnly
public header inline fun String.reversed(): String

/**
 * Returns a [Map] containing key-value pairs provided by [transform] function
 * applied to characters of the given char sequence.
 * 
 * If any of two pairs would have the same key the last one gets added to the map.
 * 
 * The returned map preserves the entry iteration order of the original char sequence.
 */
public header inline fun <K, V> CharSequence.associate(transform: (Char) -> Pair<K, V>): Map<K, V>

/**
 * Returns a [Map] containing the characters from the given char sequence indexed by the key
 * returned from [keySelector] function applied to each character.
 * 
 * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
 * 
 * The returned map preserves the entry iteration order of the original char sequence.
 */
public header inline fun <K> CharSequence.associateBy(keySelector: (Char) -> K): Map<K, Char>

/**
 * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to characters of the given char sequence.
 * 
 * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
 * 
 * The returned map preserves the entry iteration order of the original char sequence.
 */
public header inline fun <K, V> CharSequence.associateBy(keySelector: (Char) -> K, valueTransform: (Char) -> V): Map<K, V>

/**
 * Populates and returns the [destination] mutable map with key-value pairs,
 * where key is provided by the [keySelector] function applied to each character of the given char sequence
 * and value is the character itself.
 * 
 * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
 */
public header inline fun <K, M : MutableMap<in K, in Char>> CharSequence.associateByTo(destination: M, keySelector: (Char) -> K): M

/**
 * Populates and returns the [destination] mutable map with key-value pairs,
 * where key is provided by the [keySelector] function and
 * and value is provided by the [valueTransform] function applied to characters of the given char sequence.
 * 
 * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
 */
public header inline fun <K, V, M : MutableMap<in K, in V>> CharSequence.associateByTo(destination: M, keySelector: (Char) -> K, valueTransform: (Char) -> V): M

/**
 * Populates and returns the [destination] mutable map with key-value pairs
 * provided by [transform] function applied to each character of the given char sequence.
 * 
 * If any of two pairs would have the same key the last one gets added to the map.
 */
public header inline fun <K, V, M : MutableMap<in K, in V>> CharSequence.associateTo(destination: M, transform: (Char) -> Pair<K, V>): M

/**
 * Appends all characters to the given [destination] collection.
 */
public header fun <C : MutableCollection<in Char>> CharSequence.toCollection(destination: C): C

/**
 * Returns a [HashSet] of all characters.
 */
public header fun CharSequence.toHashSet(): HashSet<Char>

/**
 * Returns a [List] containing all characters.
 */
public header fun CharSequence.toList(): List<Char>

/**
 * Returns a [MutableList] filled with all characters of this char sequence.
 */
public header fun CharSequence.toMutableList(): MutableList<Char>

/**
 * Returns a [Set] of all characters.
 * 
 * The returned set preserves the element iteration order of the original char sequence.
 */
public header fun CharSequence.toSet(): Set<Char>

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each character of original char sequence.
 */
public header inline fun <R> CharSequence.flatMap(transform: (Char) -> Iterable<R>): List<R>

/**
 * Appends all elements yielded from results of [transform] function being invoked on each character of original char sequence, to the given [destination].
 */
public header inline fun <R, C : MutableCollection<in R>> CharSequence.flatMapTo(destination: C, transform: (Char) -> Iterable<R>): C

/**
 * Groups characters of the original char sequence by the key returned by the given [keySelector] function
 * applied to each character and returns a map where each group key is associated with a list of corresponding characters.
 * 
 * The returned map preserves the entry iteration order of the keys produced from the original char sequence.
 * 
 * @sample samples.collections.Collections.Transformations.groupBy
 */
public header inline fun <K> CharSequence.groupBy(keySelector: (Char) -> K): Map<K, List<Char>>

/**
 * Groups values returned by the [valueTransform] function applied to each character of the original char sequence
 * by the key returned by the given [keySelector] function applied to the character
 * and returns a map where each group key is associated with a list of corresponding values.
 * 
 * The returned map preserves the entry iteration order of the keys produced from the original char sequence.
 * 
 * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
 */
public header inline fun <K, V> CharSequence.groupBy(keySelector: (Char) -> K, valueTransform: (Char) -> V): Map<K, List<V>>

/**
 * Groups characters of the original char sequence by the key returned by the given [keySelector] function
 * applied to each character and puts to the [destination] map each group key associated with a list of corresponding characters.
 * 
 * @return The [destination] map.
 * 
 * @sample samples.collections.Collections.Transformations.groupBy
 */
public header inline fun <K, M : MutableMap<in K, MutableList<Char>>> CharSequence.groupByTo(destination: M, keySelector: (Char) -> K): M

/**
 * Groups values returned by the [valueTransform] function applied to each character of the original char sequence
 * by the key returned by the given [keySelector] function applied to the character
 * and puts to the [destination] map each group key associated with a list of corresponding values.
 * 
 * @return The [destination] map.
 * 
 * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
 */
public header inline fun <K, V, M : MutableMap<in K, MutableList<V>>> CharSequence.groupByTo(destination: M, keySelector: (Char) -> K, valueTransform: (Char) -> V): M

/**
 * Creates a [Grouping] source from a char sequence to be used later with one of group-and-fold operations
 * using the specified [keySelector] function to extract a key from each character.
 * 
 * @sample samples.collections.Collections.Transformations.groupingByEachCount
 */
@SinceKotlin("1.1")
public header inline fun <K> CharSequence.groupingBy(crossinline keySelector: (Char) -> K): Grouping<Char, K>

/**
 * Returns a list containing the results of applying the given [transform] function
 * to each character in the original char sequence.
 */
public header inline fun <R> CharSequence.map(transform: (Char) -> R): List<R>

/**
 * Returns a list containing the results of applying the given [transform] function
 * to each character and its index in the original char sequence.
 * @param [transform] function that takes the index of a character and the character itself
 * and returns the result of the transform applied to the character.
 */
public header inline fun <R> CharSequence.mapIndexed(transform: (index: Int, Char) -> R): List<R>

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each character and its index in the original char sequence.
 * @param [transform] function that takes the index of a character and the character itself
 * and returns the result of the transform applied to the character.
 */
public header inline fun <R : Any> CharSequence.mapIndexedNotNull(transform: (index: Int, Char) -> R?): List<R>

/**
 * Applies the given [transform] function to each character and its index in the original char sequence
 * and appends only the non-null results to the given [destination].
 * @param [transform] function that takes the index of a character and the character itself
 * and returns the result of the transform applied to the character.
 */
public header inline fun <R : Any, C : MutableCollection<in R>> CharSequence.mapIndexedNotNullTo(destination: C, transform: (index: Int, Char) -> R?): C

/**
 * Applies the given [transform] function to each character and its index in the original char sequence
 * and appends the results to the given [destination].
 * @param [transform] function that takes the index of a character and the character itself
 * and returns the result of the transform applied to the character.
 */
public header inline fun <R, C : MutableCollection<in R>> CharSequence.mapIndexedTo(destination: C, transform: (index: Int, Char) -> R): C

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each character in the original char sequence.
 */
public header inline fun <R : Any> CharSequence.mapNotNull(transform: (Char) -> R?): List<R>

/**
 * Applies the given [transform] function to each character in the original char sequence
 * and appends only the non-null results to the given [destination].
 */
public header inline fun <R : Any, C : MutableCollection<in R>> CharSequence.mapNotNullTo(destination: C, transform: (Char) -> R?): C

/**
 * Applies the given [transform] function to each character of the original char sequence
 * and appends the results to the given [destination].
 */
public header inline fun <R, C : MutableCollection<in R>> CharSequence.mapTo(destination: C, transform: (Char) -> R): C

/**
 * Returns a lazy [Iterable] of [IndexedValue] for each character of the original char sequence.
 */
public header fun CharSequence.withIndex(): Iterable<IndexedValue<Char>>

/**
 * Returns `true` if all characters match the given [predicate].
 */
public header inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean

/**
 * Returns `true` if char sequence has at least one character.
 */
public header fun CharSequence.any(): Boolean

/**
 * Returns `true` if at least one character matches the given [predicate].
 */
public header inline fun CharSequence.any(predicate: (Char) -> Boolean): Boolean

/**
 * Returns the length of this char sequence.
 */
@kotlin.internal.InlineOnly
public header inline fun CharSequence.count(): Int

/**
 * Returns the number of characters matching the given [predicate].
 */
public header inline fun CharSequence.count(predicate: (Char) -> Boolean): Int

/**
 * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each character.
 */
public header inline fun <R> CharSequence.fold(initial: R, operation: (acc: R, Char) -> R): R

/**
 * Accumulates value starting with [initial] value and applying [operation] from left to right
 * to current accumulator value and each character with its index in the original char sequence.
 * @param [operation] function that takes the index of a character, current accumulator value
 * and the character itself, and calculates the next accumulator value.
 */
public header inline fun <R> CharSequence.foldIndexed(initial: R, operation: (index: Int, acc: R, Char) -> R): R

/**
 * Accumulates value starting with [initial] value and applying [operation] from right to left to each character and current accumulator value.
 */
public header inline fun <R> CharSequence.foldRight(initial: R, operation: (Char, acc: R) -> R): R

/**
 * Accumulates value starting with [initial] value and applying [operation] from right to left
 * to each character with its index in the original char sequence and current accumulator value.
 * @param [operation] function that takes the index of a character, the character itself
 * and current accumulator value, and calculates the next accumulator value.
 */
public header inline fun <R> CharSequence.foldRightIndexed(initial: R, operation: (index: Int, Char, acc: R) -> R): R

/**
 * Performs the given [action] on each character.
 */
public header inline fun CharSequence.forEach(action: (Char) -> Unit): Unit

/**
 * Performs the given [action] on each character, providing sequential index with the character.
 * @param [action] function that takes the index of a character and the character itself
 * and performs the desired action on the character.
 */
public header inline fun CharSequence.forEachIndexed(action: (index: Int, Char) -> Unit): Unit

/**
 * Returns the largest character or `null` if there are no characters.
 */
public header fun CharSequence.max(): Char?

/**
 * Returns the first character yielding the largest value of the given function or `null` if there are no characters.
 */
public header inline fun <R : Comparable<R>> CharSequence.maxBy(selector: (Char) -> R): Char?

/**
 * Returns the first character having the largest value according to the provided [comparator] or `null` if there are no characters.
 */
public header fun CharSequence.maxWith(comparator: Comparator<in Char>): Char?

/**
 * Returns the smallest character or `null` if there are no characters.
 */
public header fun CharSequence.min(): Char?

/**
 * Returns the first character yielding the smallest value of the given function or `null` if there are no characters.
 */
public header inline fun <R : Comparable<R>> CharSequence.minBy(selector: (Char) -> R): Char?

/**
 * Returns the first character having the smallest value according to the provided [comparator] or `null` if there are no characters.
 */
public header fun CharSequence.minWith(comparator: Comparator<in Char>): Char?

/**
 * Returns `true` if the char sequence has no characters.
 */
public header fun CharSequence.none(): Boolean

/**
 * Returns `true` if no characters match the given [predicate].
 */
public header inline fun CharSequence.none(predicate: (Char) -> Boolean): Boolean

/**
 * Performs the given [action] on each character and returns the char sequence itself afterwards.
 */
@SinceKotlin("1.1")
public header inline fun <S : CharSequence> S.onEach(action: (Char) -> Unit): S

/**
 * Accumulates value starting with the first character and applying [operation] from left to right to current accumulator value and each character.
 */
public header inline fun CharSequence.reduce(operation: (acc: Char, Char) -> Char): Char

/**
 * Accumulates value starting with the first character and applying [operation] from left to right
 * to current accumulator value and each character with its index in the original char sequence.
 * @param [operation] function that takes the index of a character, current accumulator value
 * and the character itself and calculates the next accumulator value.
 */
public header inline fun CharSequence.reduceIndexed(operation: (index: Int, acc: Char, Char) -> Char): Char

/**
 * Accumulates value starting with last character and applying [operation] from right to left to each character and current accumulator value.
 */
public header inline fun CharSequence.reduceRight(operation: (Char, acc: Char) -> Char): Char

/**
 * Accumulates value starting with last character and applying [operation] from right to left
 * to each character with its index in the original char sequence and current accumulator value.
 * @param [operation] function that takes the index of a character, the character itself
 * and current accumulator value, and calculates the next accumulator value.
 */
public header inline fun CharSequence.reduceRightIndexed(operation: (index: Int, Char, acc: Char) -> Char): Char

/**
 * Returns the sum of all values produced by [selector] function applied to each character in the char sequence.
 */
public header inline fun CharSequence.sumBy(selector: (Char) -> Int): Int

/**
 * Returns the sum of all values produced by [selector] function applied to each character in the char sequence.
 */
public header inline fun CharSequence.sumByDouble(selector: (Char) -> Double): Double

/**
 * Splits this char sequence into a list of strings each not exceeding the given [size].
 * 
 * The last string in the resulting list may have less characters than the given [size].
 * 
 * @param size the number of elements to take in each string, must be positive and can be greater than the number of elements in this char sequence.
 * 
 * @sample samples.collections.Collections.Transformations.chunked
 */
@SinceKotlin("1.2")
public header fun CharSequence.chunked(size: Int): List<String>

/**
 * Splits this char sequence into several char sequences each not exceeding the given [size]
 * and applies the given [transform] function to an each.
 * 
 * @return list of results of the [transform] applied to an each char sequence.
 * 
 * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
 * You should not store it or allow it escape someway, unless you made a snapshot of it.
 * The last char sequence may have less characters than the given [size].
 * 
 * @param size the number of elements to take in each char sequence, must be positive and can be greater than the number of elements in this char sequence.
 * 
 * @sample samples.text.Strings.chunkedTransform
 */
@SinceKotlin("1.2")
public header fun <R> CharSequence.chunked(size: Int, transform: (CharSequence) -> R): List<R>

/**
 * Splits this char sequence into a sequence of strings each not exceeding the given [size].
 * 
 * The last string in the resulting sequence may have less characters than the given [size].
 * 
 * @param size the number of elements to take in each string, must be positive and can be greater than the number of elements in this char sequence.
 * 
 * @sample samples.collections.Collections.Transformations.chunked
 */
@SinceKotlin("1.2")
public header fun CharSequence.chunkedSequence(size: Int): Sequence<String> 

/**
 * Splits this char sequence into several char sequences each not exceeding the given [size]
 * and applies the given [transform] function to an each.
 * 
 * @return sequence of results of the [transform] applied to an each char sequence.
 * 
 * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
 * You should not store it or allow it to escape someway, unless you made a snapshot of it.
 * The last char sequence may have less characters than the given [size].
 * 
 * @param size the number of elements to take in each char sequence, must be positive and can be greater than the number of elements in this char sequence.
 * 
 * @sample samples.text.Strings.chunkedTransformToSequence
 */
@SinceKotlin("1.2")
public header fun <R> CharSequence.chunkedSequence(size: Int, transform: (CharSequence) -> R): Sequence<R> 

/**
 * Returns a list of pairs of each two adjacent characters in this char sequence.
 * 
 * @sample samples.collections.Collections.Transformations.pairwise
 */
@SinceKotlin("1.2")
public header fun CharSequence.pairwise(): List<Pair<Char, Char>>

/**
 * Returns a list containing the results of applying the given [transform] function
 * to an each pair of two adjacent characters in this char sequence.
 * 
 * @sample samples.collections.Collections.Transformations.pairwiseToFindDeltas
 */
@SinceKotlin("1.2")
public header inline fun <R> CharSequence.pairwise(transform: (a: Char, b: Char) -> R): List<R>

/**
 * Splits the original char sequence into pair of char sequences,
 * where *first* char sequence contains characters for which [predicate] yielded `true`,
 * while *second* char sequence contains characters for which [predicate] yielded `false`.
 */
public header inline fun CharSequence.partition(predicate: (Char) -> Boolean): Pair<CharSequence, CharSequence>

/**
 * Splits the original string into pair of strings,
 * where *first* string contains characters for which [predicate] yielded `true`,
 * while *second* string contains characters for which [predicate] yielded `false`.
 */
public header inline fun String.partition(predicate: (Char) -> Boolean): Pair<String, String>

/**
 * Returns a list of snapshots of the window of the given [size]
 * sliding along this char sequence with the given [step], where each
 * snapshot is a string.
 * 
 * Several last strings may have less characters than the given [size].
 * 
 * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
 * @param size the number of elements to take in each window
 * @param step the number of elements to move window forward on an each step
 * 
 * @sample samples.collections.Sequences.Transformations.takeWindows
 */
@SinceKotlin("1.2")
public header fun CharSequence.windowed(size: Int, step: Int): List<String>

/**
 * Returns a list of results of applying the given [transform] function to
 * an each char sequence representing a view over the window of the given [size]
 * sliding along this char sequence with the given [step].
 * 
 * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
 * You should not store it or allow it escape someway, unless you made a snapshot of it.
 * Several last char sequences may have less characters than the given [size].
 * 
 * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
 * @param size the number of elements to take in each window
 * @param step the number of elements to move window forward on an each step
 * 
 * @sample samples.collections.Sequences.Transformations.averageWindows
 */
@SinceKotlin("1.2")
public header fun <R> CharSequence.windowed(size: Int, step: Int, transform: (CharSequence) -> R): List<R>

/**
 * Returns a sequence of snapshots of the window of the given [size]
 * sliding along this char sequence with the given [step], where each
 * snapshot is a string.
 * 
 * Several last strings may have less characters than the given [size].
 * 
 * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
 * @param size the number of elements to take in each window
 * @param step the number of elements to move window forward on an each step
 * 
 * @sample samples.collections.Sequences.Transformations.takeWindows
 */
@SinceKotlin("1.2")
public header fun CharSequence.windowedSequence(size: Int, step: Int): Sequence<String> 

/**
 * Returns a sequence of results of applying the given [transform] function to
 * an each char sequence representing a view over the window of the given [size]
 * sliding along this char sequence with the given [step].
 * 
 * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
 * You should not store it or allow it escape someway, unless you made a snapshot of it.
 * Several last char sequences may have less characters than the given [size].
 * 
 * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
 * @param size the number of elements to take in each window
 * @param step the number of elements to move window forward on an each step
 * 
 * @sample samples.collections.Sequences.Transformations.averageWindows
 */
@SinceKotlin("1.2")
public header fun <R> CharSequence.windowedSequence(size: Int, step: Int, transform: (CharSequence) -> R): Sequence<R> 

/**
 * Returns a list of pairs built from characters of both char sequences with same indexes. List has length of shortest char sequence.
 */
public header infix fun CharSequence.zip(other: CharSequence): List<Pair<Char, Char>>

/**
 * Returns a list of values built from characters of both char sequences with same indexes using provided [transform]. List has length of shortest char sequence.
 */
public header inline fun <V> CharSequence.zip(other: CharSequence, transform: (a: Char, b: Char) -> V): List<V>

/**
 * Creates an [Iterable] instance that wraps the original char sequence returning its characters when being iterated.
 */
public header fun CharSequence.asIterable(): Iterable<Char>

/**
 * Creates a [Sequence] instance that wraps the original char sequence returning its characters when being iterated.
 */
public header fun CharSequence.asSequence(): Sequence<Char>

