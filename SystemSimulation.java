import java.util.ArrayList;
import java.util.List;

/*	
 * Author: Hasan Issa
 * Contributors:
 * This is a simulation that triggers events  
 */
public class SystemSimulation {
	private int numberOfFloors;
	private int numberOfElevators;
	private List<Floor> listOfFloors;
	private List<Elevator> listOfElevators;
	private Scheduler scheduler;

	
	public SystemSimulation(int numberOfFloors, int numberOfElevators ) {
		this.numberOfFloors = numberOfFloors;
		this.numberOfElevators = numberOfElevators;
		this.listOfFloors= new ArrayList<>();
		this.listOfElevators= new ArrayList<>();
		this.scheduler= new Scheduler();
		
		for(int i=0; i<numberOfFloors;i++) {
			listOfFloors.add(new Floor());	
		}
		for(int i=0; i<numberOfElevators;i++) {
			listOfElevators.add(new Elevator());	
		}
		
	}
	private void execute() {
		simulateFloorButtonPress(1, Direction.UP);
		//check if up button has been pressed by checking the up button floor lamp
		if ((listOfFloors.get(0).getFloorUpLampStatus() ) ==true ) {};
		simulateFloorButtonPress(2, Direction.DOWN);
		//check if down button has been pressed by checking the up button floor lamp
		if ((listOfFloors.get(1).getFloorDownLampStatus() ) ==true ) {};

		simulateFloorButtonPress(3, Direction.UP);
		//check if up button has been pressed by checking the up button floor lamp
		if ((listOfFloors.get(1).getFloorUpLampStatus() ) ==true ) {};


	}
	public void simulateFloorButtonPress(int floor, Direction direction) {
		listOfFloors.get(floor-1).pressFloorButton(direction);
	}
	public void pressFloorUp(int currentFloorNumber) {} 
	public void pressFloorDown(int currentFloorNumber) {} 
	public void chooseFloorButton(int destintationFloorNumber) {}
	public boolean getFloorUpLampStatus(int currentFloorNumber) {
		return false;
	}
	
	public boolean getFloorDownLampStatus(int currentFloorNumber) {
		return false;
	}
	public int getNumberOfFloor() {
		return numberOfFloors;
	}
	public void setNumberOfFloor(int numberOfFloor) {
		this.numberOfFloors = numberOfFloor;
	}
	public int getNumberOfElevators() {
		return numberOfElevators;
	}
	public void setNumberOfElevators(int numberOfElevators) {
		this.numberOfElevators = numberOfElevators;
	}
	public List<Floor> getListOfFloors() {
		return listOfFloors;
	}
	public void setListOfFloors(List<Floor> listOfFloors) {
		this.listOfFloors = listOfFloors;
	}
	public List<Elevator> getListOfElevators() {
		return listOfElevators;
	}
	public void setListOfElevators(List<Elevator> listOfElevators) {
		this.listOfElevators = listOfElevators;
	}
	public Scheduler getScheduler() {
		return scheduler;
	}
	public void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}
	
	public static void main(String[] args) {
		SystemSimulation systemSimulation= new SystemSimulation(10, 1);
		systemSimulation.execute();
	}


}