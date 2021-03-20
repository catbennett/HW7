package hw7;

public class Tyrannosaur extends AnimalClassTesterParent {
	
	@Override
	String name() {
		return "Tyrannosaurus Rex";
	}
	
	@Override
	String food() {
		return "other dinosaurs";
	}
	
	@Override
	String info() {
		return "Roarrr!";
	}

	@Override
	String expectedName() {
		return "Tyrannosaurus Rex";
	}

	@Override
	String expectedFood() {
		return "other dinosaurs";
	}

	@Override
	String expectedInfo() {
		return "Roarrr!";
	}

}
