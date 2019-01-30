public class Main
{
	public static void main(String[] args)
	{
		FurnitureOrderMock order = new FurnitureOrderMock();
		IOrderProcessor p = new OrderProcessor();
		p.RunUnitTests();
		for(int i=0 ;i<7; i++)
		p.ProcessOrder(order.furniture[i]);
	}
}