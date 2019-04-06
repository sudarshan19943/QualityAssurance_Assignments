public class Calculator
{
	public static int divide(int left, int right)
	{
		MathOperation op = new DivideOperation(left, right);
		return op.getResult();
	}

	public static int multiply(int left, int right)
	{
		MathOperation op = new MultiplyOperation(left, right);
		return op.getResult();
	}

	public static int add(int left, int right)
	{
		MathOperation op = new AddOperation(left, right);
		return op.getResult();
	}

	public static int subtract(int left, int right)
	{
		MathOperation op = new SubtractOperation(left, right);
		return op.getResult();
	}
}