package bookstote.entities;

import bookstore.builders.BookBuilder;
import bookstore.entities.AuthorDTO;
import bookstore.entities.BookDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookDTOTest
{
	private AuthorDTO author;
	private BookDTO book;
	@Before
	public void setUp ()
	{
		 author = new AuthorDTO("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123456789");
		 book = BookBuilder.aBook("Java 8 pratico", 59.90, author).build();
	}

	@Test
	public void mustDoDiscount ()
	{
		double expect = 53.91;

		book.doDiscount(0.1);
		double result = book.getPrice();

			Assert.assertEquals(result, expect, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void mustThrowExceptionInDiscount ()
	{
		book.doDiscount(0.4);
	}
}
