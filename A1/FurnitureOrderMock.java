
public class FurnitureOrderMock implements IOrder {

	private int customerID;
	private int quantity;
	private int furnitureID;
	//private Map<Integer, FurnitureOrderMock> furnitureHash;
	FurnitureOrderMock[] furniture = new FurnitureOrderMock[10];
	
	public FurnitureOrderMock(int furnitureID, int quantity) {
		this.furnitureID = furnitureID;
		this.quantity = quantity;
	}
	
	 public FurnitureOrderMock() {
	 	addMockfurniture();
	 }
	

public  FurnitureOrderMock(Object Object1, Object Object2) {
	System.out.println("Need to pass positive integers as parameters only");
}

	public void setQuantity(int quantity) {
		 this.quantity = quantity;
	}
	
	public void setFurnitureItemID(int id) {
		 this.furnitureID = id;
	}

	 public void addMockfurniture() {
		
	 	furniture[0] = new FurnitureOrderMock(1010, 10);
	 	furniture[1] = new FurnitureOrderMock(2003, 9);
	 	furniture[2] = new FurnitureOrderMock(6090, 4);
	 	furniture[3] = new FurnitureOrderMock(9008, 15);
	 	furniture[4] = new FurnitureOrderMock(10089, 5);
	 	furniture[5] = new FurnitureOrderMock(8000, 5);
	 	furniture[6] = new FurnitureOrderMock(3454, 23);
	 	furniture[7] = new FurnitureOrderMock(1000, -1);
	 	//furniture[8] = new FurnitureOrderMock(null, 9000);
	 }


	@Override
	public int getCustomerID() {
		return customerID;
	}

	@Override
	public int getFurnitureItemID() {
		return furnitureID;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}


}
