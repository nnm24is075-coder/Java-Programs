package oopTask1;

import java.util.Scanner;

		public class Main {
		    public static void main(String[] args) {
		        Library library = new Library();
		        Scanner sc = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("\n===== NMAMIT Library Management System =====");
		            System.out.println("1. Add New Book");
		            System.out.println("2. Issue Book");
		            System.out.println("3. Return Book");
		            System.out.println("4. Check Availability");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();
		            sc.nextLine(); // consume newline

		            try {
		                switch (choice) {
		                    case 1:
		                        System.out.print(" Type Title Name: ");
		                        String Title = sc.nextLine();
		                        System.out.print("Type Author Name: ");
		                        String Writer = sc.nextLine();
		                        System.out.print(" Type Book Number: ");
		                        String SNo = sc.nextLine();
		                        library.addingTheBook(new LibraryBook(Title, Writer, SNo));
		                        System.out.println("✅ Book has been added successfully!");
		                        break;

		                    case 2:
		                        System.out.print("BOOK NUMBER to issue: ");
		                        String issueSNo = sc.nextLine();
		                        LibraryBook bookIssue = library.findBookByISBN(issueSNo);
		                        if (bookIssue != null) {
		                            if (bookIssue.isAvailable()) {
		                                System.out.print("USER NAME: ");
		                                String person = sc.nextLine();
		                                bookIssue.bookIssue(person);
		                                System.out.println("📖 Book ISSUED TO " + person);
		                            } else {
		                                System.out.println("⚠ Book is ALREADY ISSUED to " + bookIssue.getIssuedTo() + ".");
		                            }
		                        } else {
		                            System.out.println("❌ Book NOT FOUND!");
		                        }
		                        break;

		                    case 3:
		                        System.out.print("The BOOK NUMBER to return: ");
		                        String returnSNo = sc.nextLine();
		                        LibraryBook returnBook = library.findBookByISBN(returnSNo);
		                        if (returnBook != null) {
		                            if (!returnBook.isAvailable()) {
		                                returnBook.returningTheBook();
		                                System.out.println("📖 Book RETURNED successfully!");
		                            } else {
		                                System.out.println("⚠ This book was NOT ISSUED.");
		                            }
		                        } else {
		                            System.out.println("❌ Book NOT FOUND!");
		                        }
		                        break;

		                    case 4:
		                        System.out.print("BOOK NUMBER to check availability: ");
		                        String checkSNo = sc.nextLine();
		                        LibraryBook checkBook = library.findBookByISBN(checkSNo);
		                        if (checkBook != null) {
		                            System.out.println("📌 AVAILABILITY: " +
		                                    (checkBook.isAvailable() ? "Available" : "Issued to " + checkBook.getIssuedTo()));
		                        } else {
		                            System.out.println("❌ BOOK IS NOT FOUND!");
		                        }
		                        break;

		                    case 5:
		                        System.out.println("👋Exit. Goodbye!");
		                        break;

		                    default:
		                        System.out.println("INVALID CHOICE! Please Try again.");
		                }
		            } catch (Exception e) {
		                System.out.println("❌ ERROR: " + e.getMessage());
		            }

		        } while (choice != 5);

		        sc.close();
		    }
		}


