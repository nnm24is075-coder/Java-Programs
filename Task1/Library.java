package oopTask1;


	import java.util.*;

	public class Library {
	    private List<LibraryBook> Mybooks = new ArrayList<>();

	    public void addingTheBook(LibraryBook TheBooks) {
	        Mybooks.add(TheBooks);
	    }

	    public LibraryBook findBookByISBN(String SNo) {
	        for (LibraryBook TheBooks : Mybooks) {
	            if (TheBooks.getSNo().equals(SNo))
	                return TheBooks;
	        }
	        return null;
	    }
	}



