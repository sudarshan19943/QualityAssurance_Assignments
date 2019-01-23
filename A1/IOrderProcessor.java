/*
	This is the interface the security team will use to process the order.  They will instantiate and
	populate an object that implements the IOrder interface and call ProcessOrder().  You must
	implement ProcessOrder() to move the order through the three stages:
		- Order validation: Use the known furniture ID range to validate the order is for a valid item.
		- Checking and claiming stock:  Use the IExtremeInventoryManager interface and a mock object to check for parts and claim the parts
		- Process the order by calling a database interface method to record the order in the database.

	ProcessOrder() must return the correct IOrderProcessor.OrderResponse enum result.

	The RunUnitTests() method will be called by a Main.java that the marker creates.  It must run your unit tests.
	All of your unit tests should System.out.println() one line indicating pass or failure with the following format:
		PASS - <Name of test>
		FAIL - <Name of test>
*/
public interface IOrderProcessor
{
	public enum OrderResponse
	{
		INVALID_ITEM,
		OUT_OF_STOCK,
		SUCCESS
	};

	public OrderResponse ProcessOrder(IOrder order);

	public void RunUnitTests();
}