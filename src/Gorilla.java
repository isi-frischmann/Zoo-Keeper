public class Gorilla extends Mammal{
		
	public int throwSomething() {
		System.out.println("The gorilla has thrown something " + energyLevel);
		return energyLevel -= 5;
	}

	public int eatBananas() {
		System.out.println("The gorilla's satisfaction " + energyLevel);
		return energyLevel += 10;
	}
	
	public int climb() {
		System.out.println("The gorilla has climbed a tree " + energyLevel);
		return energyLevel -= 10;
	}	
}