import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;

    public Library(){
        this.stock = new ArrayList<Book>();
    }

    public int stockCount() {
        return stock.size();
    }

    public void addBookToStock(Book book){
        stock.add(book);
    }
}
