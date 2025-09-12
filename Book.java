package oopTask1;

public class Book 
{
		    private String TitleOfTheBook;
		    private String Writer;
		    private String SNo;

		    public Book(String TitleOfTheBook, String Writer, String SNo) 
		    {
		        this.TitleOfTheBook = TitleOfTheBook;
		        this.Writer = Writer;
		        this.SNo = SNo;
		    }

		    public String getTitleOfTheBook() { return TitleOfTheBook; }
		    public String getWriter() { return Writer; }
		    public String getSNo() { return SNo; }
}




