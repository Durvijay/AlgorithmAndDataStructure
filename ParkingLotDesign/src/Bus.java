

public class Bus extends Vehicle{

	public Bus(){
		spotsNeeded = 5;
		size = VehicleSize.Large;
	}
	
	@Override
	public boolean canFitInSpot(ParkingSpot spot){
		//checks if the spot is a Large, does NOT check num of spots
		return spot.getSize() == VehicleSize.Large;
	}

}