
public class TestQueue {

	public static void main(String[] args) {
		Queue que=new Queue();
		System.out.println(que.pop());
		que.push(5);		
		que.push(15);		
		que.push(52);		
		que.push(55);		
		que.push(58);		
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		que.push(55);		
		que.push(58);
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
	}

}
