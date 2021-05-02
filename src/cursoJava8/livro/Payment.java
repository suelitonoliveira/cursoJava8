package cursoJava8.livro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

class Payment {

	private List<Product> products;
	private LocalDateTime date;
	private Costumer customer;

	public Payment(List<Product> products, LocalDateTime date, Costumer customer) {
		this.products = Collections.unmodifiableList(products);
		this.date = date;
		this.customer = customer;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public LocalDateTime getDate() {
		return this.date;
	}

	public Costumer getCustomer() {
		return this.customer;
	}

	public String toString() {
		return "[Payment: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + customer + " " + products
				+ "]";
	}

}
