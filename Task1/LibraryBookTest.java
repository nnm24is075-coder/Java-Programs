package oopTask1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class LibraryBookTest {

    @Test
    void testIssueBookSuccessfully() throws Exception {
        LibraryBook Mybook = new LibraryBook("Java ", "Joy", "1234");
        Mybook.bookIssue("Disha");

        assertFalse(Mybook.isAvailable(), "The Book should be ISSUED and UNAVAILABLE");
        assertEquals("Disha", Mybook.getIssuedTo(), "The Issued user should be 'Disha'");
    }

    @Test
    void testReturnBookSuccessfully() throws Exception {
        LibraryBook Mybook = new LibraryBook("Java ", "Joy", "1234");
        Mybook.bookIssue("Disha");
        Mybook.returningTheBook();

        assertTrue(Mybook.isAvailable(), "Book should be available after return");
        assertNull(Mybook.getIssuedTo(), "Issued user should be null after return");
    }

    @Test
    void testIssueAlreadyIssuedBookThrowsException() throws Exception {
        LibraryBook book = new LibraryBook("Java", "Joy", "1234");
        book.bookIssue("Disha");

        Exception exception = assertThrows(Exception.class, () -> {
            book.bookIssue("Geetha");
        });

        assertEquals("Book already issued to Disha.", exception.getMessage());
    }

    @Test
    void testReturnBookNotIssuedThrowsException() {
        LibraryBook book = new LibraryBook("Java", "Joy", "1234");

        Exception exception = assertThrows(Exception.class, () -> {
            book.returningTheBook();
        });

        assertEquals("Book was not issued.", exception.getMessage());
    }

    @Test
    void testIsAvailableInitiallyTrue() {
        LibraryBook book = new LibraryBook("Java", "Joy", "1234");
        assertTrue(book.isAvailable(), "Newly created book should be available");
    }
}
