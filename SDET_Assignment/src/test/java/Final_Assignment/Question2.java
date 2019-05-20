package Final_Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

//annotation for listeners
@Listeners(Final_Assignment.Listener.class)

public class Question2 {

	// Test for passing with priority 2
	@Test(priority = 2)
	public void PassingTest() {
		ListenerMore Candidate = new ListenerMore();
		Candidate.setName("Ankit");
		System.out.println(Candidate.getName());
	}

	// Test for failing with priority 1
	@Test(priority = 1)
	public void FailingTest() {
		ListenerMore Candidate = new ListenerMore();
		Candidate.setName("Ankit");
		System.out.println(Candidate.getName());
	}
}