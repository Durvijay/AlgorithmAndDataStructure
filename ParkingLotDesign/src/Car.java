
public class Car extends Vehicle{
	public Car(){
		spotsNeeded = 1;
		size = VehicleSize.Compact;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot){
		//checks if the spot is a compact or a large
		return spot.getSize() == VehicleSize.Large || spot.getSize() == VehicleSize.Compact;
	}

}
