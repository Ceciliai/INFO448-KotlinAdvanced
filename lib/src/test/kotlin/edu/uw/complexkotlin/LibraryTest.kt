/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package edu.uw.complexkotlin

import kotlin.test.*

class LibraryTest {
    @Test fun fizzbuzzToTwo() {
        assertEquals("", fizzbuzz(1..2))
    }
    @Test fun fizzbuzzToThree() {
        assertEquals("FIZZ", fizzbuzz(1..3))
    }
    @Test fun fizzbuzzToSix() {
        assertEquals("FIZZBUZZFIZZ", fizzbuzz(1..6))
    }
    @Test fun fizzbuzzToTwelve() {
        assertEquals("FIZZBUZZFIZZDOH!FIZZBUZZFIZZ", fizzbuzz(1..12))
    }
    @Test fun fizzbuzzToFifteen() {
        assertEquals("FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZ", fizzbuzz(1..15))
    }

    //Extra Credit 1:
    @Test fun fizzbuzzToFifty() {
    val expected = "FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZFIZZBUZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!FIZZFIZZBUZZDOH!FIZZBUZZFIZZDOH!BUZZ"
    val result = fizzbuzz(1..50)
    println("Actual result for fizzbuzz(1..50): $result")
    assertEquals(expected, result)
    }


    @Test fun fizzbuzzToOneHundred() {
    val expected = "FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZFIZZBUZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!FIZZFIZZBUZZDOH!FIZZBUZZFIZZDOH!BUZZFIZZFIZZBUZZDOH!FIZZFIZZBUZZDOH!BUZZFIZZFIZZDOH!FIZZFIZZBUZZDOH!FIZZBUZZFIZZDOH!BUZZFIZZFIZZBUZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZ"
    val result = fizzbuzz(1..100)
    println("Actual result for fizzbuzz(1..100): $result")
    assertEquals(expected, result)
    }


    //Extra credit 2
    @Test fun fizzbuzzWithDoh() {
    // Expected result for fizzbuzz from 1 to 21, including DOH!
    val expected = "FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZFIZZBUZZDOH!"
    val result = fizzbuzz(1..21)
    println("Actual result for fizzbuzz(1..21): $result")
    assertEquals(expected, result)
    }

    @Test fun fizzbuzzDohOnly() {
    // Test specifically for DOH! with numbers divisible by 7
    val expected = "DOH!"
    val result = fizzbuzz(7..7)
    println("Actual result for fizzbuzz(7..7): $result")
    assertEquals(expected, result)
    }

    //Extra credit 3
    @Test fun customFizzbuzzTest() {
    val fizzbuzzLambda = fizzbuzzgen(mapOf(3 to "FIZZ", 5 to "BUZZ"))
    val expected = "FIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZ"
    val result = fizzbuzzLambda(1..15)
    println("Actual result for custom FizzBuzz (1..15): $result")
    assertEquals(expected, result)
    }

    @Test fun customDohTest() {
    val customFizzbuzz = fizzbuzzgen(mapOf(3 to "FIZZ", 5 to "BUZZ", 7 to "DOH!"))
    val expected = "FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!BUZZFIZZFIZZBUZZDOH!FIZZ"
    val result = customFizzbuzz(1..21)
    println("Actual result for custom FizzBuzz with DOH! (1..21): $result")
    assertEquals(expected, result)
    }





    // Fizzbuzz to 25 should equal "FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZ"
    // Fizzbuzz to 50 should equal "FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZ"

    //@Test fun fizzbuzzgenToFifteen() {
    //    val fb = fizzbuzzgen(mapOf(3 to "FIZZ", 5 to "BUZZ"))
    //    assertEquals("FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZ", fb(1..15))
    //}

    @Test fun r1Test() {
        assertEquals(">>> FOO: {BAR}", r1())
    }
    @Test fun r2Test() {
        assertEquals(">>> FOO: {WOOGAWOOGAWOOGA}", r2())
    }

    @Test fun philosopherTests() {
        var seneca = Philosopher.THINKING
        assertEquals("Deep thoughts....", seneca.toString())

        // Shift to talking
        seneca = seneca.signal()
        assertEquals("Allow me to suggest an idea...", seneca.toString())

        // Shift to thinking
        seneca = seneca.signal()
        assertEquals("Deep thoughts....", seneca.toString())

        // Shift back to talking
        seneca = seneca.signal()
        assertEquals("Allow me to suggest an idea...", seneca.toString())
    }

    @Test fun commandTests() {
        assertEquals("", Command("")(""))
        assertEquals("> Hello!", Command("> ")("Hello!"))
    }
}
