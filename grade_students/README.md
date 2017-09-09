# Exercise: Grading students
This exercise tests how well you can use the pattern matching and collection methods.

The results are not to be printed, but rather calculated and stored in a value, using an appropriate collection when necessary.

## Getting started

You can freely create a source code file and implement your solutions inside the subproject.

You can try running your solutions from the REPL console. Do the following 

* Start `sbt` from the project root folder.
* switch to subproject `grade_students`
* enter command `console`
* import your classes/objects to use.

You can also create a runnable object and use command `run`.
```scala
object TestMyWork extends App {
   println("hello world") 
}
```

`import grade.students.Samples._` to bring the sample student names and scores into the scope. Check the source file for more info.

## Problem statements
You are given a list of student names and their test score in a class, which is in this project.

Your tasks are in the following sections. It is recommended, but not necessary, to do them in order by section.

### Section 1
1. Calculate the mean score of the class
2. determine each students' test grade

The grading scheme is as follows

| Grade | score range |
|-------|-------------|
| A     | 91-100      |
| B     | 81-90       |
| C     | 71 – 80     |
| D     | 56 – 70     |
| F     | 0 – 55      |

### Section 2
Group students according to their grade. Example:

* A: Gary
* B: Misty, Brock, Jenny
* C: Jesse, James
* D: Oak
* F: Ash

Count how many students are in each grade level. Example:

* A: 1
* B: 3
* C: 2
* D: 1
* F: 1

### Section 3

Given a name, determine student's rank in the class. Share ranking if same score. In the case where the name given doesn't exist, you should decide what to do.

For example, given these students' score:

|  name | score |
|-------|-------|
| Alice |    90 |
| Bob   |    80 |
| Carol |    80 |
| Dan   |    70 |

* Alice's ranking should be 1 / 4
* Bob and Carol should both be 2 / 4
* Dan should be 4 / 4