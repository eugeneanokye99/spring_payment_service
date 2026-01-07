# Payment Processing – IoC & Dependency Injection Demo

## Overview

This project demonstrates the evolution of a simple Java application from **manual dependency wiring** to **Spring Framework–based Inversion of Control (IoC)** and **Dependency Injection (DI)**.

The goal is to clearly show:

* Why manual object creation leads to tight coupling
* How Spring IoC enables loose coupling
* How implementations can be swapped without changing business logic

The project is intentionally simple and **does not use Spring Boot or Spring Web**.

---

## Project Structure

The repository is organized using **branches**, each representing a learning step.

### Branches

| Branch                 | Description                                                             |
| ---------------------- | ----------------------------------------------------------------------- |
| `manual-wiring`        | Plain Java implementation with dependencies wired using `new`           |
| `spring-ioc`           | Refactored version using Spring Framework IoC and constructor injection |

---

## Step 1 – Manual Wiring (Plain Java)

**Branch:** `manual-wiring`

### What this step demonstrates

* Dependency wiring using `new`
* Tight coupling at the application entry point
* Baseline before introducing Spring

### Key characteristics

* No frameworks
* No annotations
* Constructor-based dependency passing
* Simple `Main` class bootstraps everything

---

## Step 2 – Spring IoC Refactor

**Branch:** `spring-ioc`

### What this step demonstrates

* Inversion of Control (IoC)
* Constructor-based Dependency Injection
* Loose coupling via interfaces
* Swapping implementations without modifying consumers

### Key changes

* Introduced Spring Context
* Added `@Component` to managed classes
* Used constructor injection with `@Autowired`
* Added `AppConfig` with `@Configuration` and `@ComponentScan`
* Added `PaypalProcessor` as an alternative implementation of `PaymentProcessor`
* Enabled processor switching using `@Qualifier`

### What is intentionally NOT used

* Spring Boot
* Spring Web
* Controllers or REST APIs

---

## Package Structure

```
org.sping
├── Main
├── config
│   └── AppConfig
├── service
│   └── PaymentService
└── repository
    ├── PaymentProcessor
    ├── CreditCardProcessor
    └── PaypalProcessor
```

---

## How to Clone the Repository

```bash
git clone <your-repository-url>
```

---

## How to Run the Application

### Option 1: Run Step 1 (Manual Wiring)

```bash
git checkout manual-wiring
```

* Open the project in your IDE
* Run the `Main` class
* Output will indicate a **credit card payment** was processed

---

### Option 2: Run Step 2 (Spring IoC)

```bash
git checkout spring-ioc
```

* Ensure Maven dependencies are loaded
* Run the `Main` class
* Spring initializes the application context
* Payment is processed via the configured `PaymentProcessor`

To switch processors:

* Change `@Qualifier`
* **No changes required in `PaymentService`**

---

## Key Concepts Demonstrated

* Inversion of Control (IoC)
* Dependency Injection (constructor-based)
* Loose coupling via interfaces
* Clean refactoring without business logic changes

---

## Why This Project Exists

This project is designed for:

* Learning Spring fundamentals correctly
* Academic submissions
* Demonstrating clean architectural thinking

