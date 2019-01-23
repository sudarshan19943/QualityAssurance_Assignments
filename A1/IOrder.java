/*
	- Any int value is a valid customer ID.  Do not worry about validating customers.
	- Furniture ID's range from 1000 to 7000.  Anything outside of that range is an invalid furniture ID.
	- Quantity should be mocked and validated.
*/
public interface IOrder
{
	public int getCustomerID();
	public int getFurnitureItemID();
	public int getQuantity();	
}