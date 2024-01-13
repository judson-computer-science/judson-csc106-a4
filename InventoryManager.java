// TODO:  implement all stubbed out methods in this class
public class InventoryManager {

	private static final int DEFAULT_MIN_STOCK = 10;
	private static final int DEFAULT_MAX_STOCK = 100;

	private int totalProducts = 0;
	private int totalAisles = 0;

	private Aisle[] aisles = new Aisle[100];

	public InventoryManager(String[] aisleNames) {
		// use the forEach() here to populate the Aisle[]
	}

	public void addProduct(String aisleName, String name, int stock, int minStock, int maxStock) {
	}

	public void addProduct(String aisleName, String name, int stock) {
	}

	public void restock(String aisleName, String name, int amount) {
	}

	public void restock(String aisleName, String name) {
	}

	public void restockAll() {
	}

	public int checkStock(String aisleName, String name) {
	}

	public Product[] checkLowStock() {
	}

	public Product[] checkExcessStock() {
	}
}
