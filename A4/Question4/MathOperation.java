public class MathOperation
{
	public enum OperationType
	{
		DIVIDE,
		MULTIPLY,
		ADD,
		SUBTRACT
	};

	private int leftOperand;
	private int rightOperand;
	private OperationType operationType;

	public MathOperation(OperationType operationType, int leftOperand, int rightOperand)
	{
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operationType = operationType;
	}

	public int getResult()
	{
		switch (operationType)
		{
			case DIVIDE:
			{
				return leftOperand / rightOperand;
			}
			case MULTIPLY:
			{
				return leftOperand * rightOperand;
			}
			case ADD:
			{
				return leftOperand + rightOperand;
			}
			case SUBTRACT:
			{
				return leftOperand - rightOperand;
			}
		}
		return 0;
	}
}