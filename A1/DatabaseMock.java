public class DatabaseMock implements IDatabaseEntry{

//	private int furnitureID;
	
//	public DatabaseMock(int furnitureID) {
//		this.furnitureID = furnitureID;
//	}
	
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
		//Empty stub	
	}

}
