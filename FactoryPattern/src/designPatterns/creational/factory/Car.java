package designPatterns.creational.factory;

public abstract class Car {
	private CarType model;

	public Car(CarType model){
		this.model=model;
		arrangeParts();
	}

	private void arrangeParts() {
	}

	protected abstract void construct();
	
	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
}
