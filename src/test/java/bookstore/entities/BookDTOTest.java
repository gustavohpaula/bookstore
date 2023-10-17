package bookstore.entities;

import bookstore.builders.BookBuilder;
import bookstore.entities.AuthorDTO;
import bookstore.entities.BookDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BookDTOTest
{

	@Rule
	public ExpectedException exception = ExpectedException.none();

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

	@Test
	public void mustThrowExceptionInDiscount ()
	{

		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("O desconto não pode ser maior que 30%");

		book.doDiscount(0.4);


	}
}
