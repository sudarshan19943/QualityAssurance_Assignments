public class SubtractOperation extends MathOperation{

	public SubtractOperation(int leftOperand, int rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public int getResult() {
		return leftOperand - rightOperand;
	}
	
}