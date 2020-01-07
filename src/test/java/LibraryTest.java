import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
    }

    @Test
    public void libraryHasNoBooksAtStart(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void libraryCanAddBooksToStock(){
        library.addBookToStock(book);
        assertEquals(1, library.stockCount());
    }

}
