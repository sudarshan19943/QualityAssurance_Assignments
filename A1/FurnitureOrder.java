public class FurnitureOrder implements IOrder {

	private int customerID;
	private int quantity;
	private int furnitureID;
	FurnitureOrder[] furniture = new FurnitureOrder[10]; //Creating an array of mock objects
	
	public FurnitureOrder(int furnitureID, int quantity) {
		this.furnitureID = furnitureID;
		this.quantity = quantity;
	}
	
	 public FurnitureOrder() {
	 	addMockfurniture(); //Function to create mock furniture 
	 }
	
// Constructor called when objects are passed instead of integers
public  FurnitureOrder(Object Object1, Object Object2) {
	System.out.println("Need to pass positive integers as parameters only");
}

//Set quantity of different furniture items
	public void setQuantity(int quantity) {
		 this.quantity = quantity;
	}
	
//Setting furniture IDs for items
	public void setFurnitureItemID(int id) {
		 this.furnitureID = id;
	}

	 public void addMockfurniture() {
		
	 	furniture[0] = new FurnitureOrder(1010, 10);
	 	furniture[1] = new FurnitureOrder(2003, 9);
	 	furniture[2] = new FurnitureOrder(6090, 4);
	 	furniture[3] = new FurnitureOrder(9008, 15);
	 	furniture[4] = new FurnitureOrder(10089, 5);
	 	furniture[5] = new FurnitureOrder(8000, 5);
	 	furniture[6] = new FurnitureOrder(3454, 23);
	 	furniture[7] = new FurnitureOrder(1000, -1);
	 }

//Return customer ID
	@Override
	public int getCustomerID() {
		return customerID;
	}
//Return furniture ID
	@Override
	public int getFurnitureItemID() {
		return furnitureID;
	}
//Return quantity
	@Override
	public int getQuantity() {
		return quantity;
	}
}
