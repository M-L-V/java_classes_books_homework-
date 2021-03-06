import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(3);
    }

    @Test
    public void libraryHasNoBooksAtStart(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void libraryCanAddBooksToStock(){
        library.addBookToStock(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void libraryDoesNotOverstock() {
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        assertEquals(3, library.stockCount());
    }


}


