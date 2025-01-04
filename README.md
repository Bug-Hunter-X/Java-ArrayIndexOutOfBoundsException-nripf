# Java ArrayIndexOutOfBoundsException Bug

This repository demonstrates a common Java programming error: the `ArrayIndexOutOfBoundsException`. The `Bug.java` file contains code that attempts to access an array element outside of its valid index range, resulting in this exception.

The `BugSolution.java` file provides a corrected version of the code, showing how to avoid this error by properly checking array bounds before accessing elements.

## How to Reproduce

1. Clone this repository.
2. Compile `Bug.java` using a Java compiler (e.g., `javac Bug.java`).
3. Run the compiled code (e.g., `java Bug`).  You will see the `ArrayIndexOutOfBoundsException`.
4. Compile and run `BugSolution.java` to see the corrected code in action.

## Lesson Learned

Always carefully check the bounds of arrays before accessing elements to prevent `ArrayIndexOutOfBoundsException` errors.  Use loops and conditional statements to ensure that your index variables remain within the valid range of the array.