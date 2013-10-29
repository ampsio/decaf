package deobber.rebuild.nodes;

public class ArithExprNode extends Expr {

	public enum Op {
		ADD, AND, CMP, CMPG, CMPL, DIV, IOR, MUL, REM, SUB, XOR
	}
	
	private Op op;
	private Expr left, right;
	private Type type;

	public ArithExprNode(Op op, Expr left, Expr right, Type type) {
		super(type);
		this.op = op;
		this.left = left;
		this.right = right;
		this.type = type;
	}
}
