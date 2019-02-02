public class DatabaseOrders implements IDatabase{
	//Function to validate furniture item ID's in the range 1000-7000
	@Override
	public Boolean validateFurnitureItem(int furnitureItemID) {
	
		if(furnitureItemID >= 1000 && furnitureItemID <= 7000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void recordOrder(int customerID, int furnitureItemID, int quantity) {
		//Empty stub as instructed in Step 8.2
	}

	//Handling validate function if objects are passed as parameters instead of integers
	public boolean validateFurnitureItem(Object object) {
		return false;
	}
}
