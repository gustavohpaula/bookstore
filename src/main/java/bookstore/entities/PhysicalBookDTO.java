package bookstore.entities;

public class PhysicalBookDTO extends BookDTO
{
	public PhysicalBookDTO(String title, Double price, AuthorDTO author)
	{
		super(title, price, author);
	}

	public double getPrintingFee(){
		return this.getPrice() * 0.05;
	}
}
