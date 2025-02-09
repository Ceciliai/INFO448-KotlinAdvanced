/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package edu.uw.complexkotlin

// write a lambda using map and fold to solve "FIZZBUZZ" for the first fifteen numbers (0..15).
// use map() to return a list with "", "FIZZ" (for 3s) or "BUZZ" (for 5s).
// use fold() to compress the array of strings down into a single string.
// the final string should look like FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZ for 0..15.
// store this lambda into 'fizzbuzz' so that the tests can call it
//
val fizzbuzz : (IntRange) -> String = { range ->
    range.map{
        when{
            it % 105 == 0 -> "FIZZBUZZDOH!"  // 3, 5, and 7
            it % 15 == 0 -> "FIZZBUZZ"
            it % 7 == 0 -> "DOH!"             // 7
            it % 3 == 0 -> "FIZZ"
            it % 5 == 0 -> "BUZZ"
            else -> ""
        }

    }.fold("") { acc, s-> acc + s }
}

// Example usage
/*
if (fizzbuzz(1..2) == "")
    println("Success!")
if (fizzbuzz(1..3) == "FIZZ")
    println("Success!")
if (fizzbuzz(1..5) == "FIZZBUZZ")
    println("Success!")
*/

//Extra credit 3
fun fizzbuzzgen(rules: Map<Int, String>): (IntRange) -> String {
    return { range ->
        range.map { num ->
            rules.keys.sortedDescending().mapNotNull { divisor ->
                if (num % divisor == 0) rules[divisor] else null
            }.joinToString("")
        }.fold("") { acc, s -> acc + s }
    }
}



// This is a utility function for your use as you choose, and as an
// example of an extension method
fun Int.times(block: () -> Unit): Unit {
    for (it in 1..this) {
        block()
    }
}

// Use this function
fun process(message: String, block: (String) -> String): String {
    return ">>> ${message}: {" + block(message) + "}"
}

// Create r1 as a lambda that calls process() with message "FOO" and a block that returns "BAR"
val r1 = { process("FOO") {"BAR"} }

// Create r2 as a lambda that calls process() with message "FOO" and a block that upper-cases 
// r2_message, and repeats it three times with no spaces: "WOOGAWOOGAWOOGA"
val r2_message = "wooga"
val r2 = { process("FOO") { r2_message.uppercase().repeat(3) } }


// write an enum-based state machine between talking and thinking
enum class Philosopher {
    THINKING {
        override fun signal() = TALKING
        override fun toString() = "Deep thoughts...."
    },
    TALKING {
        override fun signal() = THINKING
        override fun toString() = "Allow me to suggest an idea..."
    };
    abstract fun signal(): Philosopher
 }

//Extra Credit 4: Information about Seneca the Younger 
//Seneca the Younger was a Roman philosopher, statesman, and playwright who lived in the 1st century AD.
// He is commonly associated with the Stoic school of philosophy.

//Extra Credit 5：Stoicism in a sentence:
//Stoicism teaches that the path to happiness is found in accepting the present moment, exercising control over one’s emotions, and practicing virtue, which is the only true good.

// create an class "Command" that can be used as a function.
// To do this, provide an "invoke()" function that takes a 
// single parameter ("message" of type String). Command's
// primary constructor should take a String argument ("prompt").
// When invoked, the Command object should return a String
// containing the prompt and then the message.
// Example:
// val cmd = Command(": ")
// val result = cmd("Hello!")
// result should equal ": Hello!"
class Command(val prompt: String) {
    operator fun invoke(message: String): String{
        return "$prompt$message"
    }
}


