package steps;

import functions.Palindrome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PalindromeSteps {
	Palindrome palindro;
	String txtPalindrome = "";
	@Given("I want to pass words to palindrome")
	public void i_want_to_pass_words_to_palindrome() {
	    palindro = new Palindrome();
	}
	@When("I pass {string}")
	public void i_pass(String text) {
	    txtPalindrome = text;
	}
	
	@Then("I see the Assertion is success")
	public void i_see_the_assertion() {
		Assert.assertTrue(palindro.checkPalindrome(txtPalindrome));
	}


}
