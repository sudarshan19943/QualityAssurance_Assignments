//Database interface to validate and record orders
public interface IDatabase {
	public Boolean validateFurnitureItem(int furnitureItemID);
	public void recordOrder(int customerID, int furnitureItemID, int quantity);
}
