# WORD COUNT
This subproject is a simple container for sample text to try out word count exercise.

## Getting started
You are recommended to implement the solution by creating a source code file. You can test your code by either using the console or create a runnable program.

To start the console, do the following:

* Start `sbt` from the repository root folder
* switch to subproject `word_count` by inputting command `project word_count`
* enter command `console` 

To create a runnable program, see the following example. Use command `run` in console to run.
```scala
object TestWork extends App {
    println("Hello TestWork")
}
```

`import word.count.Texts._` to bring the sample texts into the scope. Check the source code for available texts and more details.

## Problem statement
Write a function that count the number of frequency of each words that appear in any given text.

* Each word is separated by a space
* Ignore upper/lowercase
* Word order in result does not matter

Use any collection that you think is appropriate to collect all the word counts together.

## Examples
* `Hello World` should count word `hello` = 1 and word `World` = 1
* `I know you know` should count `i` = 1, `you` = 1, and `know` = 2
* `badger Badger badgeR` should count `badger` = 3

## HINTS
* values of type `String` have methods `split`,`toUpperCase` and `toLowerCase`. Check documentation to learn more.
* check Scala's collections API documentation to look for any methods that will make this work easier.