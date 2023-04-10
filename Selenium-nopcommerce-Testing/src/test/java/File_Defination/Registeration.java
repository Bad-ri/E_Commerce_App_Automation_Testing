package File_Defination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePom;
import pages.RegisterPom;

import static File_Defination.Hooks.driver;

public class Registeration {
    //WebDriver driver = null ;
    RegisterPom RP = new RegisterPom();
    HomePom HP = new HomePom();

    public static void main(String[] args) {

    }

    @When("user navigate to the register page")
    public void navigate(){
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2Fcustomer%2Finfo");
    }

    @And("^user enter a valid first name \"(.*)\"$")
    public void navigate0(String name){

        RP.Fname(driver).sendKeys(name);
    }

    @And("^user enter a valid second name \"(.*)\"$")
    public void navigate2(String name){

        RP.Sname(driver).sendKeys(name);

    }

    @And("^user enter a valid email \"(.*)\"$")
    public void navigate3(String email){

        RP.Email(driver).sendKeys(email);
    }

    @And("^user enter a valid password \"(.*)\"$")
    public void navigate4(String pass){

        RP.Password(driver).sendKeys(pass);
    }

    @And("^user enter the right password confirmation \"(.*)\"$")
    public void navigate5(String pass){

        RP.Rpassword(driver).sendKeys(pass);
    }

    @And("user click on register button")
    public void navigate6(){

        RP.Click(driver).click();

    }

    @Then("successful message will be displayed")
    public void noti7() throws InterruptedException {

        String Actual = driver.findElement(By.className("result")).getText();
        String Expected = "Your registration completed";
        Assert.assertTrue(Actual.contains(Expected),"Error message = Wrong Input");
        Thread.sleep(2000);

    }


}
