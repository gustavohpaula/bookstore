package bookstore.service;

import bookstore.builders.BookBuilder;
import bookstore.entities.AuthorDTO;
import bookstore.entities.BookDTO;

public class CadastroDeLivros
{
	public static void main(String[] args)
	{
		AuthorDTO author = new AuthorDTO("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123456789");

		BookDTO book = BookBuilder.aBook("Java 8 pratico", 59.90, author)
			.withDescription("Novos recursos da linguagem Java 8").withIsbn("123456789")
			.build();

		System.out.println(book.toString());
		try
		{
			book.doDiscount(0.4);
			System.out.println(book.toString());
		}catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}


	}
}
