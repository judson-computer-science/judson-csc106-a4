public class Product {

	private String name;
	private int stock;
	private int minStock;
	private int maxStock;

	public void setName(String name) { this.name = name; }
	public void setStock(int stock) { this.stock = stock; }
	public void setMinStock(int minStock) { this.minStock = minStock; }
	public void setMaxStock(int maxStock) { this.maxStock = maxStock; }

	public String getName() { return this.name; }
	public int getStock() { return this.stock; }
	public int getMinStock() { return this.minStock; }
	public int getMaxStock() { return this.maxStock; }
}
