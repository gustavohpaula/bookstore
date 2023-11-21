package bookstore.domain.service;

import java.util.ArrayList;
import java.util.List;

import bookstore.domain.interfaces.Product;
import org.apache.log4j.Logger;

public class ShoppingCart
{

	Logger logger = Logger.getLogger(ShoppingCart.class);
	private List<Product> productList = new ArrayList<>();
	private double total;

	public void addItem(Product product)
	{
		logger.info("Adicionando: " + product);
		productList.add(product);
		total += product.getPrice();
	}

	public double getTotal()
	{
		return total;

	}
	public List<Product> getBookList()
	{
		return productList;
	}
}
