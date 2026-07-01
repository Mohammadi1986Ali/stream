# Stream

Stream is a small Java 21 Maven project that demonstrates selecting arithmetic behavior with a map of functions.

The main API is `ArithmeticOperation.calculate(...)`, which accepts two integers and an `ArithmeticOperationType` enum value, then returns the calculated result.

## Features

- Addition, subtraction, multiplication, and integer division
- Enum-based operation selection
- Function map implementation using `BiFunction`
- JUnit 5 parameterized tests
- Lombok and Logback support for test logging

## Project Structure

```text
src/main/java/com/nexora/software/stream/
  ArithmeticOperation.java
  ArithmeticOperationType.java

src/test/java/com/nexora/software/stream/
  ArithmeticOperationTest.java
```
