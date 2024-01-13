# Assignment 4 - Method Overloading
In this assignment you will create a Java program to manage the inventory of a grocery store.
The store has a number of different aisles, each containing a number of different products.
The program needs to be able to keep track of the current stock of each product, as well as
the maximum and minimum amount of each product that should be in stock at any given time.

You will create a Java class called `InventoryManager` that will be used to manage the inventory
of the store. An `Aisle` class and a `Product` class have been provided for you in starter code
(to model the Aisles and Products - do NOT modify them). The application class is called `Main`
and is also provided for you (it should not be modified). It expects the other classes to be
available and uses them to produce the output shown below.

## Assignment Submission
You will submit your assignment using GitHub Classroom.  When you are finished and want to make your final submission, use the checkin comment "FINAL SUBMISSION":

        git add .
        git commit -m "FINAL SUBMISSION"
        git push origin main

Any submission not having this comment will be assumed to be a work-in-progress and therefore will be ignored.  This implies that you must make your final push with this commit comment before the deadline.

## Input
None.  All input for the program is hard-coded in the starter code provided.

## Output
Your output should match the output below exactly:

	$> java Main

	Low Stock Items:
	 - Grapes (curr: 7, min: 10, max: 100)
	 - Milk (curr: 10, min: 15, max: 25)
	
	Restocking Milk to max level
	
	Low Stock Items:
	 - Grapes (curr: 7, min: 10, max: 100)
	
	Curr Stock: Sour Patch Kids not found in Candy aisle.
	
	Curr Stock: Lemons not found in Produce aisle.
	
	Curr Stock: Grapes (Produce aisle): 7
	
	Curr Stock: Chicken Wings (Meat aisle): 20
	
	Curr Stock: Milk (Dairy aisle): 25
	
	Restocking everything to max levels
	
	Low Stock Items:
	
	Restocking Oranges to 100 (wrong aisle though)
	
	Restocking Grapes to 100 (non-existing aisle though)
	
	Restocking Milk to 35
	
	Excess Stock Items:
	 - French Rolls (curr: 200, min: 10, max: 100)
	 - Milk (curr: 35, min: 15, max: 25)
	
	Increasing French Rolls max inventory
	
	Excess Stock Items:
	 - Milk (curr: 35, min: 15, max: 25)
	
	Curr Stock: French Rolls (Bread aisle): 200

## Implementation Notes
- You must create an `InventoryManager` class with the following methods:
 - `addProduct()`: This method should be used to add a new product to the inventory. It should take as parameters the aisle in which the product is located, the name of the product, the current stock of the product, the minimum amount of stock that should be maintained for the product, and the maximum amount of stock that should be maintained for the product. If a product with the same name and aisle already exists in the inventory, the method should update the stock, minStock, and maxStock values for that product. This method is overloaded with a second implementation that sets the minStock and maxStock values to the defaults specified in the starter code.
 - `restock()`: This method should be used to restock a product. It should take as parameters the aisle in which the product is located, the name of the product, and the amount of stock to add. It should update the stock value for the product accordingly. If the product does not exist in the inventory, the method should do nothing. This method is overloaded with a second implementation that sets the minStock and maxStock values to the defaults specified in the starter code.
 - `restockAll()`: This method should be used to fully restock all products in the inventory to their respective maximum stock levels.
 - `checkStock()`: This method should be used to check the current stock of a product. It should take as parameters the aisle in which the product is located and the name of the product. It should return the current stock of the product as an integer. If the product does not exist in the inventory, the method should return -1.
 - `checkLowStock()`: This method should be used to check which products are running low on stock. It should return a list of the names of all products that are below their minimum stock levels.
 - `checkExcessStock()`: This method should be used to check which products have excess stock. It should return a list of the names of all products
