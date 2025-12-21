# 🧬 DNA Analyzer — Sequence Validation (Java)

This project is a DNA sequence analysis application inspired by MIT-style problem sets and a computational biology approach. The program examines a user-provided DNA sequence at the character level to perform validation and detailed analysis.

---

## 🎯 Project Objective

- Verify whether a DNA sequence consists only of valid bases (A, C, G, T)
- Report the first invalid character and its index if an error is found
- Generate a detailed analysis report for a valid DNA sequence
- Practice algorithmic thinking, loops, and character-level processing

---

## 🧠 What the Program Does

- Takes a DNA sequence from the user
- Automatically converts lowercase letters to uppercase
- Scans the DNA sequence character by character (using charAt)
- Counts A, C, G, and T bases separately
- Detects the first invalid character and its index
- If the DNA sequence is valid:
  - Calculates the total length
  - Prints the count of each nucleotide
  - Identifies the most frequent nucleotide
  - Calculates the GC content percentage

---

## 🧪 DNA Validation Rules

A valid DNA sequence may contain only the following characters:

- A
- C
- G
- T

Any character outside this set makes the DNA sequence invalid.

---

## 📌 Example Usage

Valid DNA input:
AACGTAGT

Program output:
The DNA sequence is valid.
Total length: 8
Count of A: 3
Count of C: 1
Count of G: 2
Count of T: 2
Most frequent base: A (3 occurrences)
GC content: 37.50%

Invalid DNA input:
AACXGT

Program output:
Invalid DNA sequence.
Invalid character: X
Error index: 3

---

## 📸 Sample Output

Below is an example screenshot taken from an actual program execution.

<img width="293" height="494" alt="image" src="https://github.com/user-attachments/assets/9a39785a-d3d5-4ba3-8a27-9e15d9882536" />


---

## 📁 Project Structure

DNA-Analyzer/
└── src/
    └── Main.java

---

## ▶️ How to Run

This project can be executed by running the Main.java file using IntelliJ IDEA or any Java-compatible IDE. No external libraries or dependencies are required.

---

This project provides an academic and instructional example for learning character-based analysis, loop usage, conditional logic, and data validation in Java.

—-
