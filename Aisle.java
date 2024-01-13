public class Aisle {

	private String name;
	private int totalProducts = 0;
	private Product[] products = new Product[100];

	private Aisle() {}

	public Aisle(String name) {
		this.name = name;
	}

	public String getName() { return name; }
	public int getTotalProducts() { return totalProducts; }
	public Product[] getProducts() { return products; }

	public void addProduct(Product product) {
		products[totalProducts++] = product;
	}
}
