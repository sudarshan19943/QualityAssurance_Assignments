//Test class to test FurnitureOrder.java
public class FurnitureOrderTest {
//Testing the constructor of FurnitureOrder.java
	public static void FurnitureOrderConstructorTest()
	{
		FurnitureOrder furnitureTest = new FurnitureOrder(5009, 7);
		
		if(furnitureTest.getFurnitureItemID() == 5009 && furnitureTest.getQuantity() == 7)
		{
			System.out.println("PASS - Furniture Order Constructor test");
		}
		else
		{
			System.out.println("FAIL - Furniture Order Constructor test");
		}
	}
	//Tests the setQuantity function in FurnitureOrder.java
	public static void FurnitureSetQuantityTest()
	{
		FurnitureOrder furnitureTest = new FurnitureOrder(10009, 66);
		
		furnitureTest.setQuantity(4);
		if(furnitureTest.getQuantity() == 4)
		{
			System.out.println("PASS - Furniture Set Quantity test");
		}
		else
		{
			System.out.println("FAIL - Furniture Set Quantity test");
		}
	}
	//Tests the setFurnitureItemID function in FurnitureOrder.java
	public static void FurnitureSetFurnitureItemIDTest()
	{
		FurnitureOrder furnitureTest = new FurnitureOrder(1087, 8);
		
		furnitureTest.setFurnitureItemID(7);
		if(furnitureTest.getFurnitureItemID() == 7)
		{
			System.out.println("PASS - Furniture Set Furniture Item ID test");
		}
		else
		{
			System.out.println("FAIL - Furniture Set Furniture Item ID test");
		}
	}
	//Tests the getFurnitureItemID function in FurnitureOrder.java
	public static void FurnitureGetFurnitureItemIDTest()
	{
		FurnitureOrder furnitureTest = new FurnitureOrder(4039, 29);
	
		if(furnitureTest.getFurnitureItemID() == 4039)
		{
			System.out.println("PASS - Furniture Get Furniture Item ID test");
		}
		else
		{
			System.out.println("FAIL - Furniture Get Furniture Item ID test");
		}
	}
	//Tests the getQuantity function in FurnitureOrder.java
	public static void FurnitureGetQuantityTest()
	{
		FurnitureOrder furnitureTest = new FurnitureOrder(2359, 9);
	
		if(furnitureTest.getQuantity() == 9)
		{
			System.out.println("PASS - Furniture Get Quantity test");
		}
		else
		{
			System.out.println("FAIL - Furniture Get Quantity test");
		}
	}
}
