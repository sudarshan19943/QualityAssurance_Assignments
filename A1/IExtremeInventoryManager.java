/*
	If the ExtremeInventoryManager system reports that the company has enough parts in stock to manufacture
	the given quantity of that furniture ID, canClaimPartsForItem() will return true.  Otherwise canClaimPartsForItem()
	will return false.

	claimPartsForItem() will reduce the stock of parts for that item.  Your mocks should allow for manufacturing 10
	of each of the possible furniture items (see IOrder for the valid range of furniture item IDs).
*/
public interface IExtremeInventoryManager
{
	public boolean canClaimPartsForItem(int id, int quantity);
	public void claimPartsForItem(int id, int quantity);
}