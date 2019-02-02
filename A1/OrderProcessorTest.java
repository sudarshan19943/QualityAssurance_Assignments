//Tests the OrderProcessor class
public class OrderProcessorTest {
	
	public static void ProcessOrderTest() {
	DatabaseOrders furnitureData = new DatabaseOrders();
	OrderProcessor processor = new OrderProcessor();
	//Creating mock objects and testing them
	FurnitureOrder furnitureTest_1 = new FurnitureOrder(10009, 7);
	FurnitureOrder furnitureTest_2 = new FurnitureOrder(5003, 4);
	FurnitureOrder furnitureTest_3 = new FurnitureOrder(-1, 7);
	FurnitureOrder furnitureTest_4 = new FurnitureOrder(3000, -9);
	FurnitureOrder furnitureTest_5 = new FurnitureOrder(1005, null);
	FurnitureOrder furnitureTest_6 = new FurnitureOrder(4000, 11);
	
	ExtremeInventoryManager stockData = new ExtremeInventoryManager();
	if(furnitureData.validateFurnitureItem(furnitureTest_1.getFurnitureItemID()) == false) 
	{
		
		if (processor.ProcessOrder(furnitureTest_1) == IOrderProcessor.OrderResponse.INVALID_ITEM)
		{
		System.out.println("PASS - Process Order test");
		}
		else
		{
			System.out.println("FAIL - Process Order test");
		}
	}
	if(stockData.canClaimPartsForItem(furnitureTest_2.getFurnitureItemID(), furnitureTest_2.getQuantity()))
	{
		stockData.claimPartsForItem(furnitureTest_2.getFurnitureItemID(), furnitureTest_2.getQuantity());
		furnitureData.recordOrder(furnitureTest_2.getCustomerID(), furnitureTest_2.getFurnitureItemID(), furnitureTest_2.getQuantity());
		
		if (processor.ProcessOrder(furnitureTest_2) == IOrderProcessor.OrderResponse.SUCCESS) 
		{
		System.out.println("PASS - Process Order test");
		}
		else
		{
			System.out.println("FAIL - Process Order test");
		}
	}
	if(furnitureData.validateFurnitureItem(furnitureTest_3.getFurnitureItemID()) == false) 
	{
		
		if (processor.ProcessOrder(furnitureTest_3) == IOrderProcessor.OrderResponse.INVALID_ITEM) 
		{
		System.out.println("PASS - Process Order test");
		}
		else
		{
			System.out.println("FAIL - Process Order test");
		}
	}
	if(stockData.canClaimPartsForItem(furnitureTest_4.getFurnitureItemID(), furnitureTest_4.getQuantity()) == false)
	{
		if(processor.ProcessOrder(furnitureTest_4) == IOrderProcessor.OrderResponse.OUT_OF_STOCK)
		{
			System.out.println("PASS - Process Order test");
		}
		else
		{
			System.out.println("FAIL - Process Order test");
		}
	}
	if(furnitureData.validateFurnitureItem(furnitureTest_5.getFurnitureItemID()) == false) 
	{
		
		if (processor.ProcessOrder(furnitureTest_5) == IOrderProcessor.OrderResponse.INVALID_ITEM)
		{
		System.out.println("PASS - Process Order test");
		}
		else
		{
			System.out.println("FAIL - Process Order test");
		}
	}

	if(stockData.canClaimPartsForItem(furnitureTest_6.getFurnitureItemID(), furnitureTest_6.getQuantity()) == false)
	{
		if(processor.ProcessOrder(furnitureTest_6) == IOrderProcessor.OrderResponse.OUT_OF_STOCK)
		{
			System.out.println("PASS - Process Order test");
		}
		else
		{
			System.out.println("FAIL - Process Order test");
		}
	}
}
}
