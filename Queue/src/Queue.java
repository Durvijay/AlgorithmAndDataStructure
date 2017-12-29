
public class Queue {
	private int[] queueObject;
	private int firstElement;
	private int lastElement;
	private int size;

	public Queue() {
		firstElement = -1;
		lastElement = -1;
		size = 1;
		queueObject = new int[size];
	}

	public void push(int val) {
		if (lastElement >= queueObject.length - 1)
			resize();
		queueObject[++lastElement] = val;

	}

	public Integer pop() {
		// TODO Auto-generated method stub
		if (lastElement < 0 || firstElement>=lastElement )
			return null;
		else
			return queueObject[++firstElement];
	}

	private void resize() {
		int[] temp = queueObject;
		size = size * 2;
		queueObject = new int[size];

		for (int i = 0; i < temp.length; i++) {
			queueObject[i] = temp[i];

		}

	}
}
