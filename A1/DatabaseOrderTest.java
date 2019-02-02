//Testing the class DatabaseOrders.java
public class DatabaseOrderTest {
	
	//Testing the function validateFurnitureItem in DatabaseOrders.java 
	public static void validateFurnitureItemTest()
	{
		DatabaseOrders orderTest = new DatabaseOrders();
	
		if(orderTest.validateFurnitureItem(30000) == false)
		{
			System.out.println("PASS - Validate Furniture Item test");
		}
		else
		{
			System.out.println("FAIL - Validate Furniture Item test");
		}
		if(orderTest.validateFurnitureItem(2000) == true)
		{
			System.out.println("PASS - Validate Furniture Item test");
		}
		else
		{
			System.out.println("FAIL - Validate Furniture Item test");
		}
		
		if(orderTest.validateFurnitureItem(-1) == false)
		{
			System.out.println("PASS - Validate Furniture Item test");
		}
		else
		{
			System.out.println("FAIL - Validate Furniture Item test");
		}
		if(orderTest.validateFurnitureItem(null) == false)
		{
			System.out.println("PASS - Validate Furniture Item test");
		}
		else
		{
			System.out.println("FAIL - Validate Furniture Item test");
		}
		
	}	
	
}
