package bookstore.builders;

import bookstore.entities.AuthorDTO;
import bookstore.entities.BookDTO;

public class BookBuilder
{
	private static BookDTO bookDTO;

	public BookBuilder()
	{
	}

	public static BookBuilder aBook(String name, double price, AuthorDTO author)
	{
		BookBuilder builder = new BookBuilder();
		bookDTO = new BookDTO(name, price, author);
		return builder;

	}

	public BookBuilder withDescription(String description)
	{
		bookDTO.addDescription(description);
		return this;
	}

	public BookBuilder withIsbn(String isbn)
	{
		bookDTO.setIsbn(isbn);
		return this;
	}
	public BookBuilder withAuthor(AuthorDTO author)
	{
		bookDTO.setAuthor(author);
		return this;
	}

	public BookDTO build()
	{
		return bookDTO;
	}
}
