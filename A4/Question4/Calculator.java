public class Calculator
{
	public static int divide(int left, int right)
	{
		MathOperation op = new MathOperation(MathOperation.OperationType.DIVIDE, left, right);
		return op.getResult();
	}

	public static int multiply(int left, int right)
	{
		MathOperation op = new MathOperation(MathOperation.OperationType.MULTIPLY, left, right);
		return op.getResult();
	}

	public static int add(int left, int right)
	{
		MathOperation op = new MathOperation(MathOperation.OperationType.ADD, left, right);
		return op.getResult();
	}

	public static int subtract(int left, int right)
	{
		MathOperation op = new MathOperation(MathOperation.OperationType.SUBTRACT, left, right);
		return op.getResult();
	}
}