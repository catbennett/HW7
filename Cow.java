package hw7;

public class Cow extends AnimalClassTesterParent {
	
	@Override
	String name() {
		return "Cow";
	}
	
	@Override
	String food() {
		return "grass, hay, and corn";
	}
	
	@Override
	String info() {
		return "milk and cheese";
	}

	@Override
	String expectedName() {
		return "Cow";
	}

	@Override
	String expectedFood() {
		return "grass, hay, and corn";
	}

	@Override
	String expectedInfo() {
		return "milk and cheese";
	}

	

}
