package bookstore.entities;

import bookstore.builders.BookBuilder;
import bookstore.entities.AuthorDTO;
import bookstore.entities.EBookDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EBookDTOTest
{

	@Rule
	public ExpectedException exception = ExpectedException.none();

	private AuthorDTO author;
	private EBookDTO book;
	@Before
	public void setUp ()
	{
		author = new AuthorDTO("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123456789");
		book = new EBookDTO("Java 8 pratico", 59.90, author, "watherMark");
	}

	@Test
	public void mustDoDiscount ()
	{
		double expect = 51.51;

		book.doDiscount(0.14);
		double result = book.getPrice();

		Assert.assertEquals(result, expect, 2);
	}

	@Test
	public void mustThrowExceptionInDiscount () throws IllegalArgumentException
	{

		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("O desconto não pode ser maior que 15%");

		book.doDiscount(0.4);


	}
}
