import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Catcher in the rye", "JD Salinger", "Wanky");
    }

    @Test
    public void hasTitle() {
        assertEquals("Catcher in the rye", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("JD Salinger", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Wanky", book.getGenre());
    }
}
