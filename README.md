# Module 7 - Assignment 1

This repository contains a set of small programming exercises focused on function calls, side effects, and expression evaluation order across multiple languages.

## Repository Layout

```text
.
├── README.md
└── programmingExercises/
	 ├── probOne.c
	 ├── probFour.java
	 ├── probFive.cpp
	 ├── probSix.cs
	 ├── probEight.c
	 ├── probOne      (compiled C executable)
	 ├── probFive     (compiled C++ executable)
	 ├── probEight    (compiled C executable)
	 └── probFour.class (compiled Java bytecode)
```

## Exercises Included

1. `probOne.c`
	Demonstrates pointer-based mutation inside a function and how that affects arithmetic expressions.

2. `probFour.java`
	Demonstrates static state changes inside a method call.

3. `probFive.cpp`
	C++ version of the static/global variable side-effect example.

4. `probSix.cs`
	C# version of the static variable side-effect example.

5. `probEight.c`
	Demonstrates how side effects interact with expression evaluation in C.

## Prerequisites

- `gcc` for C files
- `g++` for C++ files
- Java JDK (`javac`, `java`) for Java file
- .NET SDK (`dotnet`) for C# file
