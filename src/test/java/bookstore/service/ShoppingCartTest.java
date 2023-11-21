package bookstore.service;

import bookstore.domain.book.entitie.BookDTO;
import bookstore.domain.book.entitie.EBookDTO;
import bookstore.domain.book.entitie.MiniBookDTO;
import bookstore.domain.book.entitie.PhysicalBookDTO;
import bookstore.domain.book.entitie.author.AuthorDTO;
import bookstore.domain.service.ShoppingCart;
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
		cart.addItem(book);

		Assert.assertTrue(cart.getBookList().contains(book));
	}

	@Test
	public void mustAddEBook ()
	{
		BookDTO book = new EBookDTO("Java 8 pratico", 59.90, author, "java8");
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(book);

		Assert.assertTrue(cart.getBookList().contains(book));
	}
	@Test
	public void mustAddMiniBook ()
	{
		BookDTO book = new MiniBookDTO("Java 8 pratico", 59.90, author);
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(book);

		Assert.assertTrue(cart.getBookList().contains(book));
	}
}
