# What is Lambda Expression?

**Lambda** is equivalent to a function (method) without a name.

- Lambda's are also referred as **Anonymous** functions.
  - Method arameters.
  - Method Body.
  - Return Type.
- Lambdas are not tied to any class like a regular method.
- Lambda can also be assigned to variable and passed around.

## Syntax of the Lambda Expression

**Lmbda Expression**:

```java
 () -> {}
```

## Usages of Lambda

- Lambda is mainly used to implement Functionl Interfaces (SAM).

```java
@FunctionalInterface
public interface Comparator<T>{
    int compare(T a, T b);
}


@FunctionalInterface
public interface Runnable{
    public abstract void run();
}
```

---


# Functional Interfaces

- Exixtx since Java 1.0

### Definition:
- A Functional Interface(SAM) is an interface that has exactly one abstract method.

### @FunctionalInterface
- This annotation is introduced as part of the JDK 1.8.
- Optional annotation to signify an interface as Functional Interface.


## New Functional Interfaces in java 8

- Consumer
- Predicate
- Function
- Supplier

