public class Main
{
	public static void main(String[] args)
	{
		FurnitureOrder order1 = new FurnitureOrder(); //Creating mock order set
		FurnitureOrder order2 = new FurnitureOrder(2000, 4); //Creating specific order type with furniture ID and quantity
		IOrderProcessor p = new OrderProcessor();
		p.RunUnitTests();
		for (int i=0; i<8; i++)
		p.ProcessOrder(order1.furniture[i]);
		p.ProcessOrder(order2);
	}
}