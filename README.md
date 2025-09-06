# Design Patterns in Java

This repository contains implementations of several **Gang of Four (GoF) design patterns** in Java.  
It is part of my **Software Engineering coursework** and demonstrates understanding of object-oriented design principles.

## Implemented Patterns

### Creational
- Singleton *(already included in base project)*
- Factory Method *(already included in base project)*
- Abstract Factory *(already included in base project)*
- Builder *(already included in base project)*
- Prototype

### Structural
- Adapter
- Bridge
- Decorator

### Behavioral
- Chain of Responsibility
- Iterator
- Observer
- Strategy

## Structure

Each pattern has its own folder under `creational/`, `structural/`, or `behavioral/`.  
Inside each folder:
- Java classes for the pattern
- `Example.java` containing a simple `main()` method to demonstrate usage
- `README.md` explaining the pattern and instructions

## How to Compile and Run

You need **Java 8 or higher**.

```bash
# compile all Java files
javac */*/*.java

# run a specific example
java creational.prototype.Example
java structural.adapter.Example
java behavioral.observer.Example
