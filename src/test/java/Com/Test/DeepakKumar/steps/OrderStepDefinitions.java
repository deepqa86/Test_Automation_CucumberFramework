package Com.Test.DeepakKumar.steps;

import Pages.Home_Page;
import Pages.LogIn_Page;
import Pages.PersonalInfo_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDefinitions {

    @Given("User is on Home Screen using {string} and {string}")
    public void userIsOnHomeScreenUsingAnd(String arg0, String arg1)
    {
        LogIn_Page LogInpg = new LogIn_Page();
        LogInpg.AppsLogIn(arg0,arg1);
    }

    @And("User clicks on Tshirt Tab")
    public void userClicksOnTshirtTab() {
        Home_Page Home = new Home_Page();
        Home.SelectTshirt();
    }

    @When("User select Tshirt And click on Add to the Cart")
    public void userSelectTshirtAndClickOnAddToTheCart() {
        Home_Page Home = new Home_Page();
        Home.AddtoCart();
    }

    @Then("Item is added to Cart")
    public void itemIsAddedToCart() {
        Home_Page Home = new Home_Page();
        Home.Addtocart_verify();
    }

    @Given("User navigate to Personal Information Page")
    public void userNavigateToPersonalInformationPage() {
        PersonalInfo_Page info_page = new PersonalInfo_Page();
        info_page.NavigatetoInfopage();
    }

    @When("User update first name using {string} and {string} and click on save button")
    public void userUpdateFirstNameUsingAndAndClickOnSaveButton(String arg0, String arg1) {
        PersonalInfo_Page info_page = new PersonalInfo_Page();
        info_page.UpdateFirstname(arg0,arg1);
    }

    @Then("User is able to see a success message.")
    public void userIsAbleToSeeASuccessMessage() {

    }

}
