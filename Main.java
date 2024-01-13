/**
 * Do not modify this class
 */
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] aisles = { "Produce", "Bread", "Candy", "Meat", "Dairy" };

		InventoryManager manager = new InventoryManager(aisles);

		manager.addProduct("Produce", "Oranges", 7, 5, 10);
		manager.addProduct("Produce", "Grapes", 7);
		manager.addProduct("Bread", "French Rolls", 200);
		manager.addProduct("Meat", "Chicken Wings", 20, 15, 25);
		manager.addProduct("Dairy", "Milk", 10, 15, 25);


		printLowStockItems(manager);

		System.out.println("Restocking Milk to max level");
		manager.restock("Dairy", "Milk");

		printLowStockItems(manager);

		checkStock(manager, "Candy", "Sour Patch Kids");
		checkStock(manager, "Produce", "Lemons");
		checkStock(manager, "Produce", "Grapes");
		checkStock(manager, "Meat", "Chicken Wings");
		checkStock(manager, "Dairy", "Milk");

		System.out.println("Restocking everything to max levels");
		manager.restockAll();

		printLowStockItems(manager);

		System.out.println("Restocking Oranges to " + 100 + " (wrong aisle though)\n");
		manager.restock("Meat", "Oranges", 100);

		System.out.println("Restocking Grapes to " + 100 + " (non-existing aisle though)\n");
		manager.restock("Beauty Supplies", "Grapes", 100);

		System.out.println("Restocking Milk to " + 35);
		manager.restock("Dairy", "Milk", 35);

		printExcessStockItems(manager);

		System.out.println("Increasing French Rolls max inventory");
		manager.addProduct("Bread", "French Rolls", 200, 10, 500);

		printExcessStockItems(manager);

		checkStock(manager, "Bread", "French Rolls");

	}

	private static void checkStock(InventoryManager manager, String aisle, String name) {

		int count = manager.checkStock(aisle, name);

		System.out.print("Curr Stock: ");
		if(count >= 0) System.out.println(name + " (" + aisle + " aisle): " + count);
		else System.out.println(name + " not found in " + aisle + " aisle.");

		System.out.println("");
	}

	private static void printLowStockItems(InventoryManager manager) {
		Product[] lowProducts = manager.checkLowStock();

		System.out.println("\nLow Stock Items:");

		Arrays.stream(lowProducts).forEach(product -> {
			if(product != null)
				System.out.println(
					" - " + product.getName() + " (curr: " + product.getStock() + 
					", min: " + product.getMinStock() + ", max: " + product.getMaxStock() + ")");
		});

		System.out.println("");
	}

	private static void printExcessStockItems(InventoryManager manager) {
		Product[] excessProducts = manager.checkExcessStock();

		System.out.println("\nExcess Stock Items:");
		Arrays.stream(excessProducts).forEach(product -> {
			if(product != null)
				System.out.println(
					" - " + product.getName() + " (curr: " + product.getStock() + 
					", min: " + product.getMinStock() + ", max: " + product.getMaxStock() + ")");
		});

		System.out.println("");
	}
}
