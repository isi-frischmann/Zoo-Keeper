
public class Bat extends Mammal{
	
	public int fly() {
		System.out.println("Bat taking off " + energyLevel);
		return energyLevel -= 50;
	}
	
	public int eatHumans() {
		System.out.println("Well, never mind " + energyLevel);
		return energyLevel -= 25;
	}
	
	public int attackTown() {
		System.out.println("Town on fire" + energyLevel);
		return energyLevel -= 100;
	}
}
