package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products;
	private BigDecimal netValue;
	private BigDecimal total;
	private BigDecimal tax;

	
	Invoice() {
		netValue = new BigDecimal("0");
		total = new BigDecimal("0");
		tax = new BigDecimal("0");
		products = new ArrayList<Product>();

	}


        public void addProduct(Product product) {
		products.add(Product);
		update();
	}

	public void addProduct(Product product, Integer quantity) {
		if (quantity <= 0) {
                     throw new IllegalArgumentException();
		}
		for (int i =0; i < quantity; i++) {
		products.add(product);
		} 
		update();
	}

	public BigDecimal getSubtotal() {
		return null;
	}

	public BigDecimal getTax() {
		return null;
	}

	public BigDecimal getTotal() {
		return null;
	}	
}

