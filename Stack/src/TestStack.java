
public class TestStack {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.pop());
		stack.push(45);
		stack.push(455);
		System.out.println(stack.pop());
		stack.push(35);
		System.out.println(stack.pop());
	}

}
