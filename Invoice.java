package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;


public class Invoice {
	private Collection<Product> products;
	private BigDecimal subTotal;
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
        public void setSubTotal() {

        subTotal = BigDecimal.ZERO;
	for (Product product: products) {
		subTotal = subTotal.add(product.getPrice());
		}
	}

	public BigDecimal getSubtotal() {
		return subTotal;
	}

	public void setTax() {
         tax =  total.subtract(subTotal);

 	}
	public BigDecimal getTax() {
		return tax;
	}

	public BigDecimal getTotal() {
		return total;
	}	

	public void setTotal() {

	total = BigDecimal.ZERO;
	for (Product product: products) {
	total = total.add(product.getPriceWithTax());
		}
	}

}

