
public class OrderProcessor implements IOrderProcessor {

	@Override
	public OrderResponse ProcessOrder(IOrder order) {
		DatabaseMock furnitureData = new DatabaseMock();
		ExtremeInventoryManagerMock stockData = new ExtremeInventoryManagerMock();
		
		if(furnitureData.validateFurnitureItem(order.getFurnitureItemID()) == false) 
		{
			System.out.println("Invalid item");
			return OrderResponse.INVALID_ITEM;
		}
		
		if(stockData.canClaimPartsForItem(order.getFurnitureItemID(), order.getQuantity()))
		{
			stockData.claimPartsForItem(order.getFurnitureItemID(), order.getQuantity());
			order = stockData.getOrder();
			furnitureData.recordOrder(order.getCustomerID(), order.getFurnitureItemID(), order.getQuantity());
			System.out.println("Can claim parts");
			System.out.println("Quantity is now " + order.getQuantity());
			System.out.println("Item ID is " + order.getFurnitureItemID());
			return OrderResponse.SUCCESS;
		}
		else
		{
			System.out.println("Out of stock");
			return OrderResponse.OUT_OF_STOCK;
		}
		
	}

	@Override
	public void RunUnitTests() {
		
	}

}
