import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    
    
    @Before
    public void before(){
        library = new Library();
        book = new Book("Catcher in the rye", "JD Salinger", "Wanky");
    }

    @Test
    public void canCountNumberOfBooks() {
        assertEquals(0, library.bookCount());
    }
}
