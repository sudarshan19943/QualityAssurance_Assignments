//Tests the function ExtremeInventoryManager class
public class ExtremeInventoryManagerTest {

	//Checking parts can be claimed for various orders or not using the canClaimPartsForItem() method
	public static void canClaimPartsForItemTest() {
		//Mocking orders
		FurnitureOrder firstOrder = new FurnitureOrder(9000, 5);
		FurnitureOrder secondOrder = new FurnitureOrder(7000, 8);
		FurnitureOrder thirdOrder = new FurnitureOrder(-1, 3);
		FurnitureOrder fourthOrder = new FurnitureOrder(null, 34);
		FurnitureOrder fifthOrder = new FurnitureOrder(9000, 11);

		ExtremeInventoryManager InventoryOrder = new ExtremeInventoryManager();

		if (InventoryOrder.canClaimPartsForItem(firstOrder.getFurnitureItemID(), firstOrder.getQuantity()) == false) 
		{
			System.out.println("PASS - Can claim parts test");
		} 
		else 
		{
			System.out.println("FAIL - Can claim parts test");
		}

		if (InventoryOrder.canClaimPartsForItem(secondOrder.getFurnitureItemID(), secondOrder.getQuantity()) == true)
		{
			System.out.println("PASS - Can claim parts test");
		} 
		else 
		{
			System.out.println("FAIL - Can claim parts test");
		}

		if (InventoryOrder.canClaimPartsForItem(thirdOrder.getFurnitureItemID(), thirdOrder.getQuantity()) == false)
		{
			System.out.println("PASS - Can claim parts test");
		} 
		else
		{
			System.out.println("FAIL - Can claim parts test");
		}

		if (InventoryOrder.canClaimPartsForItem(fourthOrder.getFurnitureItemID(), fourthOrder.getQuantity()) == false) 
		{
			System.out.println("PASS - Can claim parts test");
		} 
		else 
		{
			System.out.println("FAIL - Can claim parts test");
		}

		if (InventoryOrder.canClaimPartsForItem(fifthOrder.getFurnitureItemID(), fifthOrder.getQuantity()) == false) 
		{
			System.out.println("PASS - Can claim parts test");
		} 
		else 
		{
			System.out.println("FAIL - Can claim parts test");
		}
	}
//Testing the claimPartsForItem() method
	public static void claimPartsForItemTest() {
		//Creating mock objects
		FurnitureOrder firstOrder = new FurnitureOrder(7000, 1);
		FurnitureOrder secondOrder = new FurnitureOrder(9000, 3);
		FurnitureOrder thirdOrder = new FurnitureOrder(3000, 11);

		ExtremeInventoryManager inventoryOrder = new ExtremeInventoryManager();

		if (inventoryOrder.canClaimPartsForItem(firstOrder.getFurnitureItemID(), firstOrder.getQuantity()) == true) 
		{
			//Claim the item twice, although item is not in stock
			inventoryOrder.claimPartsForItem(firstOrder.getFurnitureItemID(), firstOrder.getQuantity());
			firstOrder = inventoryOrder.getOrder();
			
				inventoryOrder.claimPartsForItem(firstOrder.getFurnitureItemID(), firstOrder.getQuantity());
				firstOrder = inventoryOrder.getOrder();
				//Checking for valid quantity is done in the canClaimPartsForItem() method, this function is for testing purposes only
				if (firstOrder.getQuantity() >= 0) 
				{
					System.out.println("FAIL - Claim parts for Furniture test");
				} 
				else 
				{
					System.out.println("PASS - Claim parts for Furniture test");
				}
			}
		 else 
		 {
			System.out.println("FAIL- Claim parts for Furniture test");
		 }

		if (inventoryOrder.canClaimPartsForItem(secondOrder.getFurnitureItemID(), secondOrder.getQuantity()) == false) 
		{
			System.out.println("PASS - Claim parts for Furniture test");
		} 
		else 
		{
			System.out.println("FAIL- Claim parts for Furniture test");
		}

		if (inventoryOrder.canClaimPartsForItem(thirdOrder.getFurnitureItemID(), thirdOrder.getQuantity()) == false) 
		{
			System.out.println("PASS - Claim parts for Furniture test");
		} 
		else 
		{
			System.out.println("FAIL- Claim parts for Furniture test");
		}

	}

}