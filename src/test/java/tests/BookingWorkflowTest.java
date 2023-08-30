package tests;

import java.time.LocalDate;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Objects.HomePage;

public class BookingWorkflowTest extends TestBase {

	HomePage homeObj;

	@Test(priority = 0)

	public void searchCity() {

		homeObj = new HomePage(driver);
		homeObj.click_On_close();
		homeObj.enter_Depart_city("Rome");

	}

	@Test(priority = 1)
	public void Click_and_open_Date_Picker() {
		homeObj = new HomePage(driver);
		// Click and open the Date Picker

		homeObj.click_on_picker_date();
		LocalDate currentdate = LocalDate.now();
		LocalDate weekDate = currentdate.plusDays(6);
		String firstDate  = weekDate.toString();
		driver.findElement(By.xpath("//span[@data-date='" + firstDate  + "']")).click();

	}

	@Test(priority = 2)
	public void select_nightStays() {
		homeObj = new HomePage(driver);

		homeObj.click_Occupancy();
		homeObj.numberOfAdulits();
		homeObj.dpselectAge();

	}

	@Test(priority = 3)
	public void clickSearchButton() {
		homeObj = new HomePage(driver);
		homeObj.clickFlightsearch();

	}

	@Test(priority = 4)
	public void verfiy_displayed_Selected_number_ofguest() {
		homeObj = new HomePage(driver);
		homeObj.check_number_of_guest("2 adults");

	}

	@Test(priority = 5)
	public void Property_rating() {
		homeObj = new HomePage(driver);
		homeObj.check3star();

	}

	@Test(priority = 6)
	public void verfiy_match_Property_rating() {
		homeObj = new HomePage(driver);
		homeObj.check_number_star("3");

	}

	public void tearDown() {
		driver.quit();
	}
}
