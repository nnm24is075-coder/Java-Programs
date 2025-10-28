Student Exam Score Logger

Purpose
This project is a simple Student Exam Score Logger built in Java, demonstrating the use of
Multithreading, File Handling, and Thread Synchronization.
It simulates multiple students submitting their exam scores at the same time,
ensuring that all scores are written safely to a single shared file without any conflicts.

Key Components

1. Student Class
Represents a student’s exam details.
Stores:
•	Student Name
•	Roll Number
•	Marks
It also provides a method to convert the details into a CSV format (toCSV()),
which is used while writing to the file.

2. ScoreLogger Class
Handles file writing operations.
Key points:
•	Uses FileWriter to write data to a CSV file.
•	Uses a synchronized method to ensure only one thread writes to the file at a time (thread safety).
•	Displays confirmation for each record written.

3. StudentThread Class
Extends the Thread class to simulate multiple students submitting their scores simultaneously.
Each thread:
•	Represents one student.
•	Calls the writeScore() method of ScoreLogger to write data to the file.
•	Runs independently but safely due to synchronization in ScoreLogger.

4. Main Class
Acts as the program entry point.
It:
•	Creates a shared ScoreLogger instance.
•	Starts multiple StudentThread threads at the same time.
•	Waits for all threads to complete using join().
•	Displays a final confirmation message once all students have submitted their scores.

5. ScoreLoggerTest (JUnit Tests)
Ensures correctness of the implementation.
Test Cases:
1.	testFileWrite()
o	Verifies that when a student’s score is written,
the correct content appears in the file.
2.	testThreadCompletion()
o	Creates multiple threads writing simultaneously to the same file.
o	Ensures all thread outputs are present, confirming safe concurrent access.

How It Works (Step-by-Step)
1.	Each student’s details are created as a Student object.
2.	Multiple StudentThread objects are started simultaneously.
3.	Each thread calls ScoreLogger.writeScore() — a synchronized method.
4.	Only one thread at a time writes to the shared file (scores.csv).
5.	After all threads finish, the final message confirms successful logging.

Summary
This program is an excellent demonstration of:
•	Multithreading
•	File Handling
•	Thread Synchronization
•	JUnit Testing

