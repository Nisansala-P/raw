package steps;

import org.junit.Assert;
import functions.Multiplier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiplierSteps {

	Multiplier mlt;
	int[] numArr;
	
	@Given("I want to pass numbers list")
	public void i_want_to_pass_numbers_list() {
		mlt = new Multiplier();
	}
	@When("I pass {int} as the number")
	public void i_pass_with_multiplier(Integer int1) {
		int[] intArr = {int1};
	    numArr = intArr;
	}
	@Then("I see the message {string}")
	public void i_see_the_message(String msg) {
		Assert.assertEquals(mlt.checkMultiplier(numArr), msg);
	}
}
