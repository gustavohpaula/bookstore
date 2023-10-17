package bookstore.entities;

import bookstore.entities.AuthorDTO;
import bookstore.entities.EBookDTO;
import bookstore.entities.PhysicalBookDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PhysicalBookDTOTest
{
	private AuthorDTO author;
	private PhysicalBookDTO book;
	@Before
	public void setUp ()
	{
		author = new AuthorDTO("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123456789");
		book = new PhysicalBookDTO("Java 8 pratico", 59.90, author);
	}

	@Test
	public void mustReturnPrintingFee(){

		double result = book.getPrintingFee();

		Assert.assertEquals(2.9, result, 1);
	}
}
