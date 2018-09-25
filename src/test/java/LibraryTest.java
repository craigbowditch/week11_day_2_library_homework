import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    
    
    @Before
    public void before(){
        library = new Library(2);
        book = new Book("Catcher in the rye", "JD Salinger", "Wanky");
    }

    @Test
    public void canCountNumberOfBooks() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void hasACapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void cannotAddBookIfStockIsFull() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }
}
