package bookstore.service;

import bookstore.entities.AuthorDTO;
import bookstore.entities.BookDTO;
import bookstore.entities.EBookDTO;
import bookstore.entities.PhysicalBookDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest
{
	private AuthorDTO author;
	@Before
	public void setUp ()
	{
		author = new AuthorDTO("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123456789");

	}
	@Test
	public void mustAddPhysicalBook ()
	{
		BookDTO book = new PhysicalBookDTO("Java 8 pratico", 59.90, author);
		ShoppingCart cart = new ShoppingCart();
		cart.addBook(book);

		Assert.assertTrue(cart.getBookList().contains(book));
	}

	@Test
	public void mustAddEBook ()
	{
		BookDTO book = new EBookDTO("Java 8 pratico", 59.90, author, "java8");
		ShoppingCart cart = new ShoppingCart();
		cart.addBook(book);

		Assert.assertTrue(cart.getBookList().contains(book));
	}
	@Test
	public void mustAddBook ()
	{
		BookDTO book = new BookDTO("Java 8 pratico", 59.90, author);
		ShoppingCart cart = new ShoppingCart();
		cart.addBook(book);

		Assert.assertTrue(cart.getBookList().contains(book));
	}
}
