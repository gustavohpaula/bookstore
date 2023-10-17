package bookstore.entities;

import java.util.Objects;

public class BookDTO
{
	private String title;
	private String description;
	private Double price;
	private String isbn;
	private AuthorDTO author;



	public BookDTO(String title, Double price, AuthorDTO author)
	{
		this.title = title;
		this.price = price;
		this.author = author;
	}


	public void addDescription(String description)
	{
		this.description = description;
	}

	public Double getPrice()
	{
		return price;
	}

	public void changePrice(Double price)
	{
		this.price = price;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public void setAuthor(AuthorDTO author)
	{
		this.author = author;
	}


	public void doDiscount(Double discountPercentage)
	{
		if (discountPercentage > 0.3)
		{
			throw new IllegalArgumentException("O desconto não pode ser maior que 30%");
		}
		this.price -= this.price * discountPercentage;
	}


	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		BookDTO bookDTO = (BookDTO) o;
		return Objects.equals(title, bookDTO.title) && Objects.equals(description, bookDTO.description)
			&& Objects.equals(price, bookDTO.price) && Objects.equals(isbn, bookDTO.isbn);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(title, description, price, isbn);
	}

	@Override
	public String toString()
	{
		return "BookDTO{" + "title='" + title + '\'' + ", description='" + description + '\''
			+ ", price=" + price + ", isbn='" + isbn + '\'' + ", author=" + author + '}';
	}
}
