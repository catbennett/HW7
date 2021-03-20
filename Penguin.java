package hw7;

public class Penguin extends AnimalClassTesterParent {
	@Override
	String name() {
		return "penguin";
	}
	
	@Override
	String food() {
		return "mostly fish";
	}
	
	@Override
	String info() {
		return "waddle and swim";
	}

	@Override
	String expectedName() {
		return "penguin";
	}

	@Override
	String expectedFood() {
		return "mostly fish";
	}

	@Override
	String expectedInfo() {
		return "waddle and swim";
	}
}


