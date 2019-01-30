
public class ExtremeInventoryManagerMock implements IExtremeInventoryManager {

	private int quantity;
	private int id;
	FurnitureOrderMock order = new FurnitureOrderMock(id, quantity);
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

	@Override
	public void claimPartsForItem(int id, int quantity) {
		int quantityClaimed;
		quantityClaimed = quantity - 1;
		order.setQuantity(quantityClaimed);
		order.setFurnitureItemID(id);
	}

	public FurnitureOrderMock getOrder(){
		return order;
	}
}
