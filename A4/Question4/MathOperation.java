public abstract class MathOperation
{
	protected int leftOperand;
	protected int rightOperand;

	public MathOperation(int leftOperand, int rightOperand)
	{
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	public abstract int getResult();
}