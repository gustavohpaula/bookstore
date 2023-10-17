package bookstore.service;

import bookstore.entities.BookDTO;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class ShoppingCart
{

	Logger logger = Logger.getLogger(ShoppingCart.class);
	private List<BookDTO> bookList = new ArrayList<>();
	private double total;

	public void addBook(BookDTO book)
	{
		logger.info("Adicionando: " + book);
		book.doDiscount(0.05);
		bookList.add(book);
		total += book.getPrice();
	}

	public double getTotal()
	{
		return total;

	}
	public List<BookDTO> getBookList()
	{
		return bookList;
	}
}
