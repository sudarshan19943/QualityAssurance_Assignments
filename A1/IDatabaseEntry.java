
public interface IDatabaseEntry {
	public Boolean validateFurnitureItem(int furnitureItemID);
	public void recordOrder(int customerID, int furnitureItemID, int quantity);
}
