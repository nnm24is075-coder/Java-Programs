package oopTask1;

public class LibraryBook extends Book implements Issueable {

	
	    private boolean Bookavailable = true;
	    private String IssuingTo;

	    public LibraryBook(String TitleOfTheBook, String Writer, String SNo) {
	        super(TitleOfTheBook, Writer, SNo);
	    }

	    @Override
	    public void bookIssue(String user) throws Exception {
	        if (!Bookavailable)
	            throw new Exception("Book already issued to " + IssuingTo + ".");
	        Bookavailable = false;
	        IssuingTo = user;
	    }

	    @Override
	    public void returningTheBook() throws Exception {
	        if (Bookavailable)
	            throw new Exception("Book was not issued.");
	        Bookavailable = true;
	       IssuingTo = null;
	    }

	    @Override
	    public boolean isAvailable() {
	        return Bookavailable;
	    }

	    public String getIssuedTo() {
	        return IssuingTo;
	    }
	}

