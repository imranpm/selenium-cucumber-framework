package com.assignment.steps;

import org.openqa.selenium.WebDriver;

import com.assignment.pom.Composemessage;
import com.assignment.pom.RegistrationPom;
import com.assignment.pom.SignupPOM;
import com.assignment.util.DriverFactory;
import com.assignment.util.DriverNames;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verrifysignupstep {

	public static WebDriver driver = DriverFactory.getDriver(DriverNames.CHROME);
	public static SignupPOM signup = new SignupPOM(driver);
	public static RegistrationPom registrationPom = new RegistrationPom(driver);
	public static Composemessage composemessage = new Composemessage(driver);

	String url = "http://elearningm1.upskills.in";

	@Given("^the website is loaded$")

	public void the_website_is_loaded() throws Throwable {

		driver.get(url);

	}

	@Given("^Engilsh is selected as Language on the home page$")
	public void engilsh_is_selected_as_Language_on_the_home_page() throws Throwable {
		System.out.println("English is selected on hom page ");

	}

	@When("^user wants to register$")
	public void user_wants_to_register() throws Throwable {

		System.out.println("Clicking on Signup");
		signup.clickSignupbutton();

	}

	@When("^mandatory fields are populated$")
	public void mandatory_fields_are_populated(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

		registrationPom.firstname();
		registrationPom.Lastname();
		registrationPom.email();
		registrationPom.username();
		registrationPom.Pass();
		registrationPom.Pass2();

	}

	@When("^Clicking on the Register button$")
	public void clicking_on_the_Register_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		registrationPom.clickregisted();
		System.out.println("clicked on registed buton sucessfully");
	}

	@Then("^display the valid message if registered successfully$")
	public void display_the_valid_message_if_registered_successfully() throws Throwable {

		registrationPom.validatemessage();

		System.out.println("Validates message");

	}

	@Given("^user registered successfully$")
	public void user_registered_successfully() throws Throwable {
		System.out.println("user is registered sucessfully");

	}

	@When("^clicked on profile dropdown at top right corner$")
	public void clicked_on_profile_dropdown_at_top_right_corner() {
		registrationPom.clickingonlogo();
		System.out.println("Clicked on logodropdown");

	}

	@Then("^display profile details such as name and email$")
	public void display_profile_details_such_as_name_and_email() {

		System.out.println("username and email displayed");

	}

	@Then("^validate name and email of the user\\.$")
	public void validate_name_and_email_of_the_user() throws Throwable {
		registrationPom.verifyingemailandname();

		System.out.println("Email is verified");
	}

	@Given("^user wants to send an message to other user$")
	public void user_wants_to_send_an_message_to_other_user() throws Throwable {
		registrationPom.clikingonhome();

		System.out.println("clciked on home button");
		registrationPom.clikingcompose();
		composemessage.Sendto();
		composemessage.Subject();
		composemessage.Message();
		composemessage.clicksendmessage();
		composemessage.verifyingemailack();

	}

}
