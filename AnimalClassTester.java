package hw7;

public class AnimalClassTester {
	
	public boolean testAnimalObject(AnimalClassTesterParent animal) {
		
		if (animal.name().equals(animal.expectedName())) {
			if (animal.food().equals(animal.expectedFood())) {
				if (animal.info().equals(animal.expectedInfo())) {
					return true;
				}
			}
			
		}
		return false;
	}

}
