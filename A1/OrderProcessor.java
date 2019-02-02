public class OrderProcessor implements IOrderProcessor {

	@Override
	public OrderResponse ProcessOrder(IOrder order) {
		DatabaseOrders furnitureData = new DatabaseOrders();
		ExtremeInventoryManager stockData = new ExtremeInventoryManager();
		
		//Checking for invalid items
		if(furnitureData.validateFurnitureItem(order.getFurnitureItemID()) == false) 
		{
			System.out.println("Invalid item");
			return OrderResponse.INVALID_ITEM;
		}
		
		//Checking for valid items, claiming them and recording the order in the database
		if(stockData.canClaimPartsForItem(order.getFurnitureItemID(), order.getQuantity()))
		{
			stockData.claimPartsForItem(order.getFurnitureItemID(), order.getQuantity());
			order = stockData.getOrder();
			furnitureData.recordOrder(order.getCustomerID(), order.getFurnitureItemID(), order.getQuantity());
			System.out.println("Item ID is " + order.getFurnitureItemID());
			System.out.println("Quantity is now: " + order.getQuantity());
			return OrderResponse.SUCCESS;
		}
		else //If the quantity of items is invalid
		{
			System.out.println("Out of stock");
			return OrderResponse.OUT_OF_STOCK;
		}
		
	}
//Function to call unit tests
	@Override
	public void RunUnitTests() {
		
		// -----------Unit tests for FurnitureOrder.java----------------------
		FurnitureOrderTest.FurnitureOrderConstructorTest();
		FurnitureOrderTest.FurnitureGetFurnitureItemIDTest();
		FurnitureOrderTest.FurnitureGetQuantityTest();
		FurnitureOrderTest.FurnitureSetFurnitureItemIDTest();
		FurnitureOrderTest.FurnitureSetQuantityTest();
		System.out.println("--------------------------");
		
		// -----------Unit tests for DatabaseOrders.java----------------------
		DatabaseOrderTest.validateFurnitureItemTest();
		System.out.println("--------------------------");
		
		//-----------Unit tests for ExtremeInventoryManager.java----------------------
		ExtremeInventoryManagerTest.canClaimPartsForItemTest();
		ExtremeInventoryManagerTest.claimPartsForItemTest();
		System.out.println("--------------------------");
		
		//-----------Unit tests for OrderProcessor.java----------------------
		OrderProcessorTest.ProcessOrderTest();
		System.out.println("--------------------------");
		
	}
}
