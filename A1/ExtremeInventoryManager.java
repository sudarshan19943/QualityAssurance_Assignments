public class ExtremeInventoryManager implements IExtremeInventoryManager {

	private int quantity;
	private int id;
	
	FurnitureOrder order = new FurnitureOrder(id, quantity);
	//Function to check whether furniture item IDs in the range 1000-7000 having less 10 items can be claimed or not
	@Override
	public boolean canClaimPartsForItem(int id, int quantity) {
		if (id >= 1000 && id <= 7000 && quantity > 0 && quantity <=10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
//Function to claim parts for specific furniture IDs
	@Override
	public void claimPartsForItem(int id, int quantity) {
		int quantityClaimed;
		quantityClaimed = quantity - 1; //Reduces stock by 1 unit
		order.setQuantity(quantityClaimed);
		order.setFurnitureItemID(id);
	}
//Function to update the order values
	public FurnitureOrder getOrder(){
		return order;
	}
//Handling of canClaimPartsForItem function if objects are passed as parameters instead of integers
	public boolean canClaimPartsForItem(Object object_1, Object object_2) {
		return false;
	}
}
